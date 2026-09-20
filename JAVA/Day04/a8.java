package JAVA.Day04;

//Super keyword

class parent1{
    void fop(){
    System.out.println("Parent class executed");
    }
}

class child extends parent1{
    void foc(){
        super.fop();
        System.out.println("Child class executed");
    }
}

public class a8 {

    public static void main(String[] args){
        child obj = new child();
        obj.foc();
    }
}
