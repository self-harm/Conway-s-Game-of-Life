package io.harmed;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class GameOfLife extends javax.swing.JFrame{
    private JButton playButton;
    private JButton resetButton;

    /*the matrix of true/false values*/
   /* 100 - rows
    200 - columns*/
    final int width = 200;
    final int height = 100;
    boolean[][] currentMove = new boolean[height][width];
    boolean[][] nextMove = new boolean[height][width];
    boolean play;


    public GameOfLife() {
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameOfLife().setVisible(true);
            }
        });
    }
}
