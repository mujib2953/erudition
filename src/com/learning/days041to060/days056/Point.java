package com.learning.days041to060.days056;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(new Point(0, 0));
    }

    public double distance(int x, int y) {
        return this.distance(new Point(x, y));
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
}
