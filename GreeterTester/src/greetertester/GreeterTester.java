/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetertester;
import greeter.Greeter;
/**
 *
 * @author sumarshall
 */
public class GreeterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greeter firstGreeter = new Greeter("Sule");
        Greeter secondGreeter = firstGreeter;
        firstGreeter.setName("Nick");
        String greeting = secondGreeter.sayHello();
        System.out.println(greeting);
        
        secondGreeter = new Greeter("Sule");
        firstGreeter.swapNames(secondGreeter);
        greeting = firstGreeter.sayHello();
        System.out.println(greeting);
        greeting = secondGreeter.sayHello();
        System.out.println(greeting);
    }
    
}
