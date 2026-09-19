package JAVA.Day03;

//copy constructor

public class a9 {

    int age;
    String name;

    //parameterized constructor

    a9(int a, String n){
        age = a;
        name = n;
    }

    a9(a9 obj){
        age = obj.age;
        name = obj.name;
    }

    void display(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

    public static void main(String[] args){
        a9 obj = new a9(12, "Surendra");
        obj.display();

        a9 obj2 = new a9(obj);
        obj2.display();
    }
}
