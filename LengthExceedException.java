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
public class LengthExceedException  extends Exception{    

    public LengthExceedException() {
       super("More than 12!!");
    }
    
    
    public LengthExceedException(String message){
        super(message);
    }
}
