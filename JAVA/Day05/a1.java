package JAVA.Day05;

//method overloading

class superman{  //Super Class
    
    int calculation(int a, int b){  //method 1
        return a + b;
    }

    int calculation(int a, int b, int c){   //method 2
        return a + b + c;
    }

    double calculation(double a, double b){   //method 3
        return a + b;
    }
}


public class a1 {

    public static void main(String[] args) {

        superman obj = new superman();
        System.out.println(obj.calculation(2 , 4)); 
        System.out.println(obj.calculation(22, 22, 45));
        System.out.println(obj.calculation(22.48, 22.52));
    }
}
