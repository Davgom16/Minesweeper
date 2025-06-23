/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minesweeper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dav_g
 */
public class Minesweeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myKB;
        Random rand;
        int i;
        int j;
        int h = 5;
        int count = 0;
        int user_input = 6;
        int mine_location;
        int result;
        String hit = "x";
        String miss = "0";
        String [][] mine_field;
        int [] op;
        int row;
        int col;
        
        myKB = new Scanner (System.in);
        rand = new Random();
        mine_field = new String[h][h];
        op = new int [5];
        mine_location = rand.nextInt(h*h) + 1;
        result = user_input - mine_location;
        
        for (i = 0; i < h; i++) {
            
            for (j = 0; j < h; j++) {
              
                //matrix[i][j] = String.valueOf(count++);
                mine_field[i][j] = "-";
                System.out.print(mine_field[i][j] + "\t");
                
            }
            
            System.out.println();
            
        } 
        
        do {
            
            System.out.println("number?");
            user_input = myKB.nextInt();
            op[count] = user_input;
            row = (user_input - 1) / h;
            col = (user_input - 1) % h;            
            
            count = count++;
            
        } while (count < 6); 
        
    }
    
}
