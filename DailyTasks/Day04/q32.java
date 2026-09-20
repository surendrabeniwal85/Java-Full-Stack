package DailyTasks.Day04;

//Accessing Private Members Using Getter and Setter

class StudentB{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class q32 {

    public static void main(String[] args) {
        StudentB obj = new StudentB();
        
        obj.setName("Surendra Beniwal");

        System.out.println("Name : " + obj.getName());
    }
}
