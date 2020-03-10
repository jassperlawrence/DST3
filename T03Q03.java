/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03Q03;

/**
 *
 * @author Jassper
 */
public class T03Q03 {
    
    public static void  writeBlock(char a, int b, int c){
        //b : no of char in each line ,, c : no of lines
        // Base Case : b =0 , c=0 2 for loops
       //Base Case
       
       if(c>0){
           System.out.println(writeLine(a,b));     
           writeBlock(a,b,c-1); 
       }
       
    
    }
    
    public static String writeLine(char b, int c){
        if(c==0){//Base Case
            return "";
        }
        else 
            return b+writeLine(b,c-1);
        
    }
    
    
    public static void main(String[] args) {
        writeBlock('$',3,2);
    }
    
}

