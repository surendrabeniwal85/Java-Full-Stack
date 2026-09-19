package DailyTasks.Day03;

//Employee Information program

class Employee{
    String name;
    int employeeid;
    String dept;

void display(){
    System.out.println("Name : " + name);
    System.out.println("Id : " + employeeid);
    System.out.println("Department: " + dept);
}

}

public class q4 {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.name = "Surendra";
        obj.employeeid = 101;
        obj.dept = "IT";

        obj.display();
    }
}

