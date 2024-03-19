package Chap_2_1;

public class _2_1_Variable {
    public static void main(String[] args) {

        int x = 123; // initialization

        System.out.println("My number is : " + x);

        String name = "kim";

        System.out.println("My first Name is " + name);

        float a = 1.5f;
        double b = 2.5;

        System.out.println("나의 왼쪽눈 시력은 " + a);
        System.out.println("나의 오른쪽눈 시력은 " + b);

        String X = "A";
        String Y = "B";

        String temp;

        temp = X;
        X=Y;
        Y = temp;

        System.out.println(X + Y);
    }
}
