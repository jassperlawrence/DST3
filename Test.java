/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03Q03;

import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class Test {
    public static void main(String[] args) {
        
        try {
            Scanner in = new Scanner (System.in);
            System.out.print("Enter a sentence : ");
            String s1=in.nextLine();
            
            if(s1.length()>=12){
                throw new LengthExceedException("Length exceed 12 characters");
            }
        } catch (LengthExceedException e) {
            System.out.println(e.getMessage());
        }
    }
}
