package com.tswing;

import com.tswing.annotations.BeginRender;
import com.tswing.annotations.Parameter;

import javax.swing.*;

import static com.tswing.BindingConstants.LITERAL;

public class Label {
    @Parameter(defaultPrefix = LITERAL)
    private String text;

    @Parameter(defaultPrefix = LITERAL)
    private String constraints;

    @BeginRender
    public boolean beginRender(SwingWriter writer) {
        JLabel label = new JLabel(text);
        writer.add(label, constraints);
        return false;
    }
}