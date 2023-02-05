package com.company;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    Main(String s, int w, int h){
        super(s);
        setSize(w, h);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        Panel hexagon = new Panel();
        hexagon.add(new MyGraphics());
       // hexagon.setForeground(Color.black);
        hexagon.setBounds(210,70,250,200);
        add(hexagon);

        Button makeRed = new Button("Залити фігуру червоним");
        makeRed.setForeground(new Color(255, 255, 255));
        makeRed.setBackground(new Color(140, 0, 0));
        makeRed.setFont(new Font("Serif", Font.PLAIN, 16));
        makeRed.setBounds(65, 300, 175, 30);
        add(makeRed);
        makeRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                hexagon.setForeground(Color.RED);
            }
        });

        Button makeYellow = new Button("Залити фігуру жовтим");
        makeYellow.setForeground(Color.BLACK);
        makeYellow.setBackground(Color.yellow);
        makeYellow.setFont(new Font("Serif", Font.PLAIN, 16));
        makeYellow.setBounds(250, 300, 175, 30);
        add(makeYellow);
        makeYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                hexagon.setForeground(Color.yellow);
            }
        });

        Button cancel = new Button("Скасувати");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setFont(new Font("Serif", Font.PLAIN, 16));
        cancel.setBounds(435, 300, 175, 30);
        add(cancel);;
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                hexagon.setForeground(null);
            }
        });

    }

    public class MyGraphics extends JComponent {

        MyGraphics() {
            setPreferredSize(new Dimension(250,200));
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //Color black = new Color(0,0,0);
            //g.setColor(black);
            //setForeground(Color.black);
            int [] x = {85, 40, 85,165,210,165};
            int [] y = {40,110, 180,180,110,40};
            g.fillPolygon(x,y,6);
        }
    }

    public static void main(String[] args) {
	Main Frame = new Main("Лабораторна робота №6", 700, 500);
        Frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
}
