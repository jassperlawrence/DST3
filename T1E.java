/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jassper
 */
public class T1E {
    
    public static void main(String[] args) {
        System.out.println(sum(3));
    }
    //recursive method that computes the first n cubes
    public static double sum(int a){
        //Let base case be when a=0
        if(a==1){
            return 1;
        }
        else
            return Math.pow(a,3)+sum(a-1);
    }
    
}
