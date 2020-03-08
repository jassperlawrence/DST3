/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jassper
 */
public class T1D {
    
    //recursive method that converts decimal to binary
    public static int dec2bin(int a){
        //String s must be empty in main
        //repeated division
        if(a==0){
            return 0;
        }
        else{
            return (a%2 + 10*dec2bin(a/2));
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(dec2bin(100));
    }
    
}
