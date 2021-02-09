package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        JFrame fr=new JFrame("<><><><><<>><><><><>");
        fr.setPreferredSize( new Dimension(300,300));
        final JPanel pan= new JPanel();
        fr.add(pan);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        Timer tm= new Timer(50, new ActionListener(){
            int i=0;
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Random rand = new Random();

                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                Color randomColor = new Color(r, g, b);


                Graphics2D gr=(Graphics2D)pan.getRootPane().getGraphics();
                pan.update(gr);
                GeneralPath path=new GeneralPath();




                gr.translate(150, 150);
                gr.setColor(randomColor);
                AffineTransform tranforms = AffineTransform.getRotateInstance((i++)*0.07, 0, 0);
                gr.transform(tranforms);
                gr.draw(path);


                gr.drawLine(0, 0, 200, 200);

            }});
        tm.start();
    }
}
