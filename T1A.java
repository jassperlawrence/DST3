/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jassper
 */
public class T1A {
    //find the smallest number in an array
    public static int min(int[]t,int a){
        //base case is when index is t.length(a)
        int min1=t[a];
        if(a==0){
           return min1; 
        }
        else {
            if (t[a]<min1){
                min1=t[a];
            }
            return min(t,a-1);
        }
    }
    
    public static void main(String[] args) {
        int [] yeboi={100,200,500,600,101};
        System.out.println(min(yeboi,yeboi.length-1));
    }
    
    
}
