package cw.zoomanagementsystem;

/**
 *
 * @author PARIS
 */
public class Animal {
    String name;
    int age;
    
    public void setName(String name) {
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age) {
        this.age=age;
    }
    
    public int setAge(){
        return age;
    }
    
    public void makeSound(int times){
        System.out.println("Animal sound!");
    }
    public void eat(String foodType){
        System.out.println("Animal food!");
    }
}
