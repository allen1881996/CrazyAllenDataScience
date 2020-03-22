package com.allenhuang;

import javax.crypto.spec.PSource;
// cannot be inherent from final class
public final class CheckBox extends UIControl {
    public CheckBox() {
        super(true);
    }

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}
