package DailyTasks.Day04;

//Using this to Resolve Variable Conflict

public class q19 {

    String name;

    q19(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name : " + this.name);
    }

    public static void main(String[] args){
        q19 obj = new q19("Surendra Beniwal ");
        obj.display();
    }
    
}
