package apackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class ChessFrame extends JFrame{

    private BoardPanel panel;
    
    public ChessFrame(){
        panel = new BoardPanel();
        this.setContentPane(panel);

        MouseMoveListener listener = new MouseMoveListener();
        panel.addMouseMotionListener(listener);

        this.setVisible(true); 
        this.setSize(400, 400);
        this.setTitle("Chessboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    class BoardPanel extends JPanel{

        private static final int ROWS = 8;
        private static final int COLS = 8;
        
        private int xCoord = 50;
        private int yCoord = 50;

        public void setXCoord(int x){
            xCoord = x;
        }
        public void setYCoord(int y){
            yCoord = y;
        }

        public void paintComponent(Graphics g){
            int sqsize = this.getHeight()/ROWS;
            for(int i=0; i<ROWS; i++){
                for(int j=0; j<COLS; j++){
                    int x = j*sqsize;
                    int y = i*sqsize;

                    g.setColor(Color.YELLOW);
                    g.fillRect(x,y,sqsize,sqsize);
                    if((i+j)%2 == 0){
                        g.setColor(Color.BLACK);
                        g.fillRect(x,y,sqsize,sqsize);
                    }
                }
            }
            g.setColor(Color.MAGENTA);
            g.fillOval(xCoord, yCoord, 40, 40);
        }
    }

    class MouseMoveListener implements MouseMotionListener{
        public void mouseDragged(MouseEvent e){
            int x = e.getX();
            int y = e.getY();

            panel.setXCoord(x-20);
            panel.setYCoord(y-20);
            panel.repaint();
        }
        public void mouseMoved(MouseEvent e){}
    }    

} 


