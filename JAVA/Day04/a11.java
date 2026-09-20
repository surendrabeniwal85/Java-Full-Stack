package JAVA.Day04;

//private access modifier

class person{
    private String name; //private

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class a11 {

    public static void main(String[] args){
        person obj = new person();
        obj.setName("Surendra Beniwal");
        System.out.println(obj.getName());
    } 
}
