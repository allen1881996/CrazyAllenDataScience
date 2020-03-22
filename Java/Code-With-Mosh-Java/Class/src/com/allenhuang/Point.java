package com.allenhuang;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj instanceof Point){
            var other = (Point)obj;
            return other.x == x && other.y == y;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        // generate a hashcode based on the content, instead of
        return Objects.hash(x,y);
    }
}
