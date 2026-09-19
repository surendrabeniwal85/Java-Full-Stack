package DailyTasks.Day03;

//Employee Salary Calculation

class Employee1{
    String name;
    double basicSalary;
    double bonus;

    double calculateSalary(){
        return basicSalary + bonus;
    }

    void display(){
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Enter Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

public class q5 {
    public static void main(String[] args){
        Employee1 obj = new Employee1();

        obj.name = "Surendra";
        obj.basicSalary = 30000;
        obj.bonus = 5000;

        obj.display();
    }
}
