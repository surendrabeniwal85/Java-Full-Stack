package DailyTasks.Day03;

//Multiple objects using parameterized constructor

public class q17 {
    String name;
    int rollno;
    
    q17(String n, int r){
        name = n;
        rollno = r;
    }

    public void display(){

        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollno);
        System.out.println();
    }

    public static void main(String[] args){

        q17 obj1 = new q17("Surendra", 1218);
        q17 obj2 = new q17("Naman", 1219);
        q17 obj3 = new q17("Ayush", 1846);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
