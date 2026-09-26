package JAVA.Day09;

//Example of heap usage

public class a3 {

    public static void main(String[] args) {
        new Person("John");
        new Person("Alice");
    }
}

class Person{
    String name;

    Person(String name){
        this.name = name;
        System.out.println("Person created : " + this.name);
    }
}
