/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("A = ");
        long a = keyboard.nextLong();
        System.out.print("B = ");
        long b = keyboard.nextLong();
        
        

        for (long i = a; i <= b; i++) {
            System.out.print(i+" ");
            
        }
        
        
    }
    
    
}
