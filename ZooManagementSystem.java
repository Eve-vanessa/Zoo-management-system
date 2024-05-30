package cw.zoomanagementsystem;

/**
 *
 * @author PARIS
 */
public class ZooManagementSystem {

    public static void main(String[] args) {
        lion lionObj=new lion();
        lionObj.makeSound(3);
        lionObj.eat("meat");
        
        elephant elephantObj=new elephant();
        elephantObj.makeSound(2);
        elephantObj.eat("grass");
        
        monkey monkeyObj=new monkey();
        monkeyObj.makeSound(5);
        monkeyObj.eat("bananas");
    }
}
