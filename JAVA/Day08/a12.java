package JAVA.Day08;

//Multiple bounds

interface Printable{
    void print();
}

class Person{

    void display(){
        System.out.println("Person");
    }
}

//T must extend Person and implement Printable
class DemoA<T extends Person & Printable>{

    T obj;

    DemoA(T obj){
        this.obj = obj;
    }

    void show(){
        obj.display();
        obj.print();
    }
}

//A class that satisfies both bounds
class Student extends Person implements Printable{

    @Override 
    public void print(){
        System.out.println("Student Print");
    }
}

public class a12 {

    public static void main(String[] args) {
        
        DemoA<Student> obj = new DemoA<>(new Student());

        obj.show();
    }
}
