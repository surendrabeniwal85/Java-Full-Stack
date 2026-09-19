package DailyTasks.Day03;

//Constructor Overloading

class RectangleR{
    int length;
    int width;

    RectangleR(){
        length = 1;
        width = 1;
    }

    RectangleR(int side){
        length = side;
        width = side;
    }

    RectangleR(int length, int width){
        this.length = length;
        this.width = width;
    }

    int calArea(){
        return length * width;
    }

}

public class q15 {
    public static void main(){
        RectangleR rect1 = new RectangleR();
        RectangleR rect2 = new RectangleR(5);
        RectangleR rect3 = new RectangleR(10, 5);

        System.out.println("Area 1 : " + rect1.calArea());
        System.out.println("Area 2 : " + rect2.calArea());
        System.out.println("Area 3 : " + rect3.calArea());

    } 
}
