package com.company;

import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame("Тестерок!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(new GamePanel());
        window.setUndecorated(true);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
