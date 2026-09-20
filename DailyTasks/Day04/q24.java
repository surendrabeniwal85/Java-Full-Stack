package DailyTasks.Day04;

//Passing Current Object Using this

public class q24 {

    String name = "Surendra Beniwal";

    void sendObj(q24 student){
        System.out.println("Name : " + student.name);
    }

    void show(){
        sendObj(this);
    }

    public static void main(String[] args){
        q24 student = new q24();
        student.show();
    }
    
}