package com.tswing;

import com.tswing.annotations.BeginRender;
import com.tswing.annotations.Parameter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import static com.tswing.BindingConstants.LITERAL;

public class TextField {
    @Parameter(defaultPrefix = LITERAL)
    private Binding value;

    @Parameter(defaultPrefix = LITERAL)
    private String constraints;

    @BeginRender
    public boolean beginRender(SwingWriter writer) {
        JTextField textField = new JTextField(value.get(String.class));
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                value.set(textField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                value.set(textField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                value.set(textField.getText());
            }
        });
        writer.add(textField, constraints);

        return false;
    }
}
