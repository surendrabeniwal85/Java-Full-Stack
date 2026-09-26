package JAVA.Day08;

class Box<T>{
    T value;

    void setValue(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}

public class a8 {
    public static void main(String[] args) {
        
        Box<String> box1 = new Box<>();
        box1.setValue("Java");

        System.out.println(box1.getValue());

        Box<String> box2 = new Box<>();
        box1.setValue("Java");

        System.out.println(box2.getValue());
        
    }
    
}
