package week1.day1.people;

/**
 * Created by Letricia on 7/11/16.
 */
public class Student extends Person {

    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(){
        gpa = 4.0;
        setName("Bob");
        setGender("Male");
        setAge(12);

    }


}
