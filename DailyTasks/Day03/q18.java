package DailyTasks.Day03;

public class q18 {

    int age;
    String name;

    //parameterized constructor

    q18(int a, String n){
        age = a;
        name = n;
    }

    q18(q18 obj){
        age = obj.age;
        name = obj.name;
    }

    void display(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

    public static void main(String[] args){
        q18 obj = new q18(12, "Surendra");
        obj.display();

        q18 obj2 = new q18(obj);
        obj2.display();
    }
}
