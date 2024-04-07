package com.tswing;

import com.tswing.annotations.BeginRender;
import com.tswing.annotations.Parameter;

import javax.swing.*;
import javax.swing.table.TableModel;

import static com.tswing.BindingConstants.LITERAL;
import static com.tswing.BindingConstants.PROP;

public class Table {
    @Parameter(defaultPrefix = PROP)
    private TableModel tableModel;

    @Parameter(defaultPrefix = LITERAL)
    private String constraints;

    @BeginRender
    public boolean beginRender(SwingWriter writer) {
        JTable jTable = new JTable(tableModel);
        writer.add(jTable, constraints);
        return false;
    }
}
