/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 * A Class for creating simple greetings
 *
 * @author sumarshall
 */
public class Greeter {

     /**
         Constructs a Greeter object that can greet a person or entity.
         @param aName the name of the person or entity who should
         be addressed in the greetings.
      */
    private String name;
    public Greeter(String aName){
        name = aName;
    }
    public static void main(String[] args) {
         /**
         Initializes new Greeter object with name and calls the sayHello method on that Greeter.
         * @param myGreeter the greeter object created. 
         * @param greeting the output of the sayHello method call on the myGreeter object.
      */
        Greeter myGreeter = new Greeter("Sule");
        String greeting = myGreeter.sayHello();
        System.out.println(greeting);
    }
    public String sayHello(){
         /**
         Returns a string of a greeting to the person to be greeted
         @param name instance variable containing the name of the person to be greeted
      */
        return "Hello " + name +"!";
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void swapNames(Greeter other){
        String nameHolder = name.toString();
        this.setName(other.getName());
        other.setName(nameHolder);
    }
}
