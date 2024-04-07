package com.tswing;

import com.tswing.annotations.AfterRender;
import com.tswing.annotations.BeginRender;
import com.tswing.annotations.Parameter;

import javax.swing.*;
import java.awt.*;

import static com.tswing.BindingConstants.LITERAL;
import static com.tswing.BindingConstants.PROP;

public class Panel {
    @Parameter(defaultPrefix = LITERAL)
    private String constraints;

    @Parameter(defaultPrefix = PROP)
    private LayoutManager layoutManager;

    @BeginRender
    public void beginRender(SwingWriter writer) {
        JPanel panel = new JPanel();
        if (layoutManager != null) {
            panel.setLayout(layoutManager);
        }
        writer.push(panel, constraints);
    }

    @AfterRender
    public void afterRender(SwingWriter writer) {
        writer.pop();
    }
}
