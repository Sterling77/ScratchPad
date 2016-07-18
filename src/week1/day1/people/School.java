package week1.day1.people;

/**
 * Created by Letricia on 7/11/16.
 */
public class School {

    public static void main(String [] args){

    Teacher t= new Teacher();
        t.setName("Mary");
        t.setAge(99);
        t.setGender("Male");
        t.setSalary(42000.65);

        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getGender());
        System.out.println(t.getSalary());

        Student s = new Student();
        s.setName("Phill");
        s.setAge(99);
        s.setGender("Male");
        s.setGpa(42000.65);

        System.out.println(t.getName());
        Parent p = new Parent();
        System.out.println(p.getHasStudent());

        Parent.getHasStudent();




    }



}

