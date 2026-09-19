package JAVA.Day03;

public class a6 {

    public void get(String name1){
        System.out.println(name1 + " is eating");
    }

    public void set(String name2){
        System.out.println(name2 + " is dancing");
    }

    public static void main(String[] args){

        a6 obj1 = new a6();
        obj1.get("Surendra");
        obj1.set("Surendra");

        a6 obj2 = new a6();
        obj2.get("Naman");
        obj2.set("Naman");
    }
}
