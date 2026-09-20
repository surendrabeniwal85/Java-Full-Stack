package DailyTasks.Day04;

// Method Chaining Using this

public class q25 {

    String name;
    int age;

    q25 setName(String name){
        this.name = name;
        return this;
    }

    q25 setAge(int age){
        this.age = age;
        return this;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args){
        q25 student = new q25();

        student.setName("Surendra Beniwal").setAge(22).display();
    }
    
}
