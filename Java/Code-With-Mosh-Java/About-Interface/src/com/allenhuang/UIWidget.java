package com.allenhuang;
// a class cannot have multiple parents, but a interface can
public interface UIWidget extends Draggable, Resizable {
    void render();

}

