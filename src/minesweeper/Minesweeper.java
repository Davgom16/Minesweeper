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
        int ii;
        int j;
        int jj;
        int h = 4;
        int k;
        int count = 1;
        int count2 = 0;
        int count3 = 0;
        int user_input;
        int [] mine_location;
        String [][] mine_field;
        int [] op;
        int [] row;
        int [] col;
        
        myKB = new Scanner (System.in);
        rand = new Random();
        mine_field = new String[h][h];
        op = new int [4];
        k = (int) (0.5*h);
        mine_location = new int [k];
        row = new int [op.length];
        col = new int [op.length];

        
        
        
        
        for (i = 0; i < h; i++) {
            
            for (j = 0; j < h; j++) {
              
                mine_field[i][j] = String.valueOf(count++);
                System.out.print(mine_field[i][j] + "\t");
                
            }
            
            System.out.println();
            
        } 
        
        for (i = 0; i < k; i++) {
            
            mine_location[i] = rand.nextInt(h*h) + 1;
            
        }
        
        do {
            
            count = 1;
            System.out.println("number? \n");
            user_input = myKB.nextInt();
            op[count3] = user_input;           
            
            for (i = 0; i < h; i++) {
            
                for (j = 0; j < h; j++) {
                    
                    mine_field[i][j] = String.valueOf(count++);
                    
                    
                    for (ii = 0; ii < op.length; ii++) {
                    
                        for (jj = 0; jj < mine_location.length; jj++) {
                            
                            if (op[ii] != 0){ 

                                if (op[ii] == mine_location[jj]){

                                    row[ii] = ((op[ii] - 1) / h);
                                    col[ii] = ((op[ii] - 1) % h);

                                    mine_field[row[ii]][col[ii]] = "X";
                                    
                                    break;

                                }else{

                                    row[ii] = ((op[ii] - 1) / h);
                                    col[ii] = ((op[ii] - 1) % h);

                                    mine_field[row[ii]][col[ii]] = "0";


                                }
                            }

                        }    
                        
                    }
                    
                    System.out.print(mine_field[i][j] + "\t");
                }
            
            System.out.println();
            
            }
            
            count2 = count2 +1;
            count3 = count3 +1;
            
        } while (count2 < 4); 
        
        System.out.println("\n the answer was ");
        
        for (i = 0; i < k; i++){
            
            System.out.println("\n" + mine_location[i]);
            
        }
        
    }
    
}
