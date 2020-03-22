package com.allenhuang;

public class TextBox extends UIControl {
    // inheritance from UIControl, UIControl extends Object class
    private String text = "Hello World";

    // final method can not be override
    public final void printIsEnable(){
        // now the child class have access to the protected attribute
        System.out.println(isEnabled);
    }

    public TextBox() {
        // explicitly call the parent constructor
        super(true);
        System.out.println("TextBox");
        // private attribute are not inherited by subclasses
    }

    // method override, annotation, give extra info to compiler
    @Override
    public String toString() {
        return text;
    }

    public void setText(String newText) {
        text = newText;
    }

    @Override
    public void render() {
        System.out.println("render TextBox");
    }
}
