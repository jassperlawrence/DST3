/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jassper
 */
public class T1C {
    
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        else{
            return gcd(y,x%y);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(240,15));
    }
}
