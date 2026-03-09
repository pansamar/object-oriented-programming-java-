package apackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class ChessFrame extends JFrame{

    private BoardPanel panel;
    
    public ChessFrame(){
        panel = new BoardPanel();
        this.setContentPane(panel);

        this.setVisible(true); 
        this.setSize(400, 400);
        this.setTitle("Chessboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }


    class BoardPanel extends JPanel{

        private static final int ROWS = 8;
        private static final int COLS = 8;
        
        public void paintComponent(Graphics g){

            int sqsize = this.getHeight()/ROWS;
            for(int i=0; i<ROWS; i++){
                for(int j=0; j<COLS; j++){
                    int x = j*sqsize;
                    int y = i*sqsize;
                    g.setColor(Color.YELLOW);
                    g.fillRect(x,y,sqsize,sqsize);
                    if((i+j)%2 == 0){
                        g.setColor(Color.CYAN);
                        g.fillRect(x,y,sqsize,sqsize);
                    }
                    }
                }
            }
        }
     } 


