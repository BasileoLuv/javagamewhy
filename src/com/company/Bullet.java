package com.company;

import java.awt.*;

public class Bullet {
    //Fields
    private double x;
    private double y;
    private int r;
    private Color color;
    private int speed;

    //Constructor
    public Bullet(){
        x = GamePanel.player.getX();
        y = GamePanel.player.getY();
        r = 3;

        speed = 10;
        color = Color.YELLOW;

    }
    //Functions
    public double getX() {return x;}
    public double getY() {return y;}
    public int getR() {return r;}

    public void update(){
        y -= speed;

    }
    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval((int)x, (int)y, r, 2 * r);

    }
}
