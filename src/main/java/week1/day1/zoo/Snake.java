package week1.day1.zoo;

/**
 * Created by Letricia on 7/11/16.
 */
public class Snake extends Reptile {
    public Snake(){
        this.name = "Snake";
    }
    @Override
    public void makeSound(){
        System.out.println("Sssssssss!");
    }
}
