package cw.zoomanagementsystem;

/**
 *
 * @author PARIS
 */
public class elephant extends Animal{
    public void makeSound(int times){
        for(int i=0;i<times;i++){
            System.out.println("Trumpet");
        }
    }
    
    public void eat(String foodType){
        System.out.println("Eating" + foodType);
    }
  }