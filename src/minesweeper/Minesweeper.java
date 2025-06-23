/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minesweeper;

/**
 *
 * @author dav_g
 */
public class Minesweeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] matrix = new int[6][6];
        int i;
        int j;
        int count = 1;
        
        for (i = 0; i < 6; i++) {
            
            for (j = 0; j < 6; j++) {
              
                matrix[i][j] = count++;
                System.out.print(matrix[i][j] + "\t");
                
            }
            
            System.out.println();
            
        } 
       
    }
    
}
