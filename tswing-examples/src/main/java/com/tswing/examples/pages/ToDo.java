package com.tswing.examples.pages;

import com.tswing.annotations.SetupRender;
import com.tswing.examples.model.ToDoItem;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private TableModel tableModel;

    private List<ToDoItem> toDoItems;

    @SetupRender
    public void setupRender() {
        toDoItems = new ArrayList<>();
        tableModel = createTableModel();
    }

    public TableModel getTableModel() {
        return tableModel;
    }

    private TableModel createTableModel() {
        return new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return toDoItems.size();
            }

            @Override
            public int getColumnCount() {
                return 2;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                ToDoItem item = toDoItems.get(rowIndex);
                switch (columnIndex) {
                    case 0: return item.getDescription();
                    case 1: return item.getStatus();
                    default: throw new RuntimeException("Illegal columnIndex " + columnIndex);
                }
            }
        };
    }
}
