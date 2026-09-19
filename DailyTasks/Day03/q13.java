package DailyTasks.Day03;

//Constructor with multiple parameters

class EmployeeC{
    String name;
    int id;
    double salary;

    EmployeeC(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }

}
public class q13 {

    public static void main(String[] args){
        EmployeeC emp = new EmployeeC("Surendra Beniwal", 101, 45000);

        emp.display();
    } 
}
