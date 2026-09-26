package JAVA.Day08;

class Demo<D, E>{
    D value1;
    E value2;

    Demo(D value1, E value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public void display(){
        System.out.println(value1);
        System.out.println(value2);
    }
}

public class a4 {
    public static void main(String[] args) {
        Demo<Integer,String> obj = new Demo<>(1218, "Surendra");
        obj.display();
    }
}
