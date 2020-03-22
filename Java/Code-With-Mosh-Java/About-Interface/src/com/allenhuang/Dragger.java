package com.allenhuang;

public class Dragger {
    // method injection
    public void drag(UIWidget draggable) {
        draggable.drag();
        System.out.println("Dragging Done");
        draggable.render();
    }

}
