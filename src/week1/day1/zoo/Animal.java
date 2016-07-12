package week1.day1.zoo;

/**
 * Created by Letricia on 7/11/16.
 */
public class Animal {
    public String name;

    public void makeSound() {
        System.out.println("Animal sound!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
