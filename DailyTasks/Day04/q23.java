package DailyTasks.Day04;

//Returning Current Object Using this

public class q23 {

    String name;

    q23(String name){
        this.name = name;
    }

    q23 obj(){
        return this;
    }

    public static void main(String[] args){
        q23 student = new q23("Surendra Beniwal");

        q23 result = student.obj();

        System.out.println("Name : " + result.name);
    }
    
}
