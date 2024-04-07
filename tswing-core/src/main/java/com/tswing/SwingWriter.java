package com.tswing;

import java.awt.*;

public interface SwingWriter {
    void add(Component component, Object constraints);
    void push(Component component, Object constraints);
    void pop();
}
