/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singletontestdemo;

/**
 *
 * @author kasun
 */
public class SingletonTestDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singleton instance = Singleton.getInstance("first copy text");
        System.out.println("1st instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.clipboard + "\n");
        
        
        Singleton instance2 = Singleton.getInstance("second copy text");
        System.out.println("2nd instance ID: " + System.identityHashCode(instance2));
        System.out.println(instance2.clipboard + "\n");
        
    }
}











