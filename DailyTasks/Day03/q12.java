package DailyTasks.Day03;

//Parameterized Constructor

public class q12 {

    String name;
    int rollno;
    

    q12(String n , int r){
        name = n;
        rollno = r;
    }

    public void display(){

        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollno);
        
    }

    public static void main(String[] args){

        q12 obj = new q12("Surendra", 12);
        obj.display();
    }
}
