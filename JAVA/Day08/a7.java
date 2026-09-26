package JAVA.Day08;

class TestA<T>{
    static int count = 0;

    TestA(){
        count++;
    }
}


public class a7 {
    public static void main(String[] args) {
        TestA<Integer> obj1 = new TestA<>();
        TestA<String> obj2 = new TestA<>();
        TestA<Double> obj3 = new TestA<>();

        System.out.println(TestA.count);
    }
}
