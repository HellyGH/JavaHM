//задачи от 1-3
public class Main {
    public static void main(String[] args) {
        Person Helly = new Person();
       // Helly.name="Helly";
       // Helly.age=20;
        Student student = new Student();
       // student.grade = 5.50;

        Helly.printDetails("Helly", 20, 5.50);
    }
}
public class Person implements Printable{
    String name;
    int age;

    void introduce(){
        System.out.println("Hello this is "+name);
        System.out.println("I'am" + age);
    }
     @Override
    public void printDetails(String name, int age,double grade) {
        System.out.println("Hello my name is" + name + "i am" + age + "and my grade is:" + grade);

    }
}
public class Student extends Person{
    double grade;

    @Override
    public void introduce() {
        System.out.println("My grade is"+grade);
    }

    @Override
    public void printDetails(String name, int age,double grade) {
        super.printDetails(name, age,grade);
    }
}

public interface Printable {
    void printDetails(String name, int age,double grade);
}

//Задача 4 Създайте абстрактен клас Shape с методи area() и perimeter(). 
//Създайте класове Circle и Rectangle, които наследяват Shape и имплементират тези методи.
public abstract class Shape {
   abstract void area();
   abstract void perimeter();
}
public class Circle extends Shape{
    @Override
    void area() {
    }@Override
    void perimeter() {

    }
}
public class Rectangle extends Shape{ 
    @Override
    void area() {
    }@Override
    void perimeter() {

    }
}
//Задача 5




