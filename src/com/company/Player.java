package com.company;
import java.awt.*;

public class Player {
    //Fields
    private double x;
    private double y;
    private int r;
    private double dx;
    private double dy;
    private int speed;

    private Color color1;
    //private Color color2;

    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;

    public static boolean isFiring;

    //Constructor
    public Player(){
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;

        r = 5;
        speed = 15;
        dx = 0;
        dy = 0;

        color1 = Color.RED;

        up = false;
        down = false;
        right = false;
        left = false;
        isFiring = false;
    }

    //Functions
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }


    public void update(){
        if (up && y > r){
            dy -= speed;
        }
        if (down && y < GamePanel.HEIGHT - r) {
            dy += speed;
        }
        if (left && x > r) {
            dx -= speed;
        }
        if (right && x < GamePanel.WIDTH - r){
            dx += speed;
        }
        if (up && left || up && right|| down && left || down && right) {
            dy = dy * Math.sin(45);
            dx = dx * Math.cos(45);
        }
        y += dy;
        x += dx;

        dy = 0;
        dx = 0;

        if(isFiring){
            GamePanel.bullets.add(new Bullet());
        }

    }
    public void draw(Graphics2D g){

        g.setColor(color1);
        g.fillOval((int) (x - r),(int)(y - r), 2 * r, 2 * r);
        g.setColor(color1.darker());
        g.drawOval((int) (x - r),(int)(y - r), 2 * r, 2 * r);
        g.setStroke(new BasicStroke(3));

    }
}
