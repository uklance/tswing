package com.tswing;

import com.tswing.annotations.BeginRender;
import com.tswing.annotations.Parameter;
import jakarta.inject.Inject;

import javax.swing.*;

import static com.tswing.BindingConstants.LITERAL;
import static com.tswing.BindingConstants.PROP;

public class Button {
    @Inject
    private ComponentResources componentResources;

    @Parameter(defaultPrefix = LITERAL)
    private String text;

    @Parameter(defaultPrefix = LITERAL)
    private String eventType;

    @Parameter(defaultPrefix = PROP)
    private Object[] eventContext;

    @Parameter(defaultPrefix = LITERAL)
    private String constraints;

    @BeginRender
    public boolean beginRender(SwingWriter writer) {
        JButton button = new JButton(text);
        button.addActionListener(event -> componentResources.triggerEvent(eventType, eventContext));
        writer.add(button, constraints);
        return false;
    }
}
