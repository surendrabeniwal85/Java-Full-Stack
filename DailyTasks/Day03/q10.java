package DailyTasks.Day03;

//Student Result Calculation

class Student3{
    String name;
    int marks1;
    int marks2;
    int marks3;

    int calTotal(){
        return marks1 + marks2 + marks3;
    }

    double calPercentage(){
        return calTotal()/3;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + calTotal());
        System.out.println("Obtained Percentage : " + calPercentage());
    }

}

public class q10 {
    public static void main(String[] args){
        Student3 s = new Student3();

        s.name = "Surendra Beniwal";
        s.marks1 = 97;
        s.marks2 = 89;
        s.marks3 = 80;

        s.display();
    } 
}
