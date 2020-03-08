/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jassper
 */
public class T1B {
    
    
    public static int sum(int []t,int a,int sum){
       //a is for index , sum is to carry the total in the recursive method 
       if(a==0){
           sum+=t[a];
           return sum;
       }
       else{
           sum+=t[a];
           return sum(t,a-1,sum);
       }
        
    }
    
    public static void main(String[] args) {
        int a[]={5,2,4,3,1};
        System.out.println(sum(a,a.length-1,0));//sum start with 0
    }
}
