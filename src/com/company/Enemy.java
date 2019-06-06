package com.company;
import java.awt.*;

public class Enemy {
    //Fields
    private double x;
    private double y;
    private int r;

    private double health;

    private double speed;
    private double dx;
    private double dy;

    private int type;
    private int rank;

    private Color color;


    //Constructor
    public Enemy(int type,int rank){

        this.type = type;
        this.rank = rank;
        switch (type){
            case (1):color = Color.GREEN;
                switch (rank){
                    case (1):

                        x = Math.random() * GamePanel.WIDTH;
                        y = 0;
                        r = 5;
                        speed = 2;
                        health = 1;
                        double angle = Math.toRadians(Math.random()*360);
                        dx = Math.sin(angle)*speed;
                        dy = Math.cos(angle)*speed;
                }
        }

    }

    //Functions
    public double getX() {return x;}
    public double getY() {return y;}
    public int getR(){return r;}

    public boolean remove(){
        if (health <=0) {
            return true;
        }
        return false;
    }

    public void hits() {
        health--;
    }

    public void update(){
        x += dx;
        y += dy;
        if(x < 0 && dx < 0) dx =- dx;
        if(x > GamePanel.WIDTH && dx > 0) dx = -dx;
        if(y < 0 && dy < 0) dy =- dy;
        if(y > GamePanel.WIDTH && dy > 0) dy = -dy;
    }

    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval((int)(x - r), (int)(y - r), 3 * r, 2 * r);
        g.setStroke(new BasicStroke(3));
        g.setColor(color.darker());
        g.drawOval((int)(x - r), (int)(y - r), 1 * r, 2 * r);
        g.setStroke(new BasicStroke(1));

    }

}
