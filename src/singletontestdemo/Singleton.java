/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singletontestdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author kasun
 */
public class Singleton {
    
    //create global access point
    private static Singleton firstInstance = null;
    
    String[] clipboardArr = {"1","2","3","4","5","6","7","8",
        "9","10","11","12","13","14","15","16","17","18","19","20"};
    String clipboard = "";
    private LinkedList<String> numberlist = new LinkedList<> (Arrays.asList(clipboardArr));
    
    static boolean threadOne = true;
    
    //keep the constructor private
    private Singleton(){
        
    }
    
    //add synchronized to avoid multiple accesses in multithread environments
    public static synchronized Singleton getInstance(String text){
                
        if(firstInstance == null){
            
            firstInstance = new Singleton();
            //firstInstance.clipboard = text;
            
        }
        firstInstance.clipboard = text;
        Collections.shuffle(firstInstance.numberlist);
        //System.out.println("suffled"); 
        
        return firstInstance;
    }
    
    public LinkedList<String> getNumberList(){
        return firstInstance.numberlist;
    }
    
}
















