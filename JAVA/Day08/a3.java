package JAVA.Day08;

//Generics class with <>

class Test<T>{
    T var; //Generic class as variable

    Test(T var){
        this.var = var; //Generic class as Constructor
    }

    public void display(){
        System.out.println(var);
    }
}

public class a3 {
    public static void main(String[] args) {

        Test<Integer> iobj = new Test<>(10);
        iobj.display();

        Test<String> sobj = new Test<>("Raj");
        sobj.display();
    }
    
}
