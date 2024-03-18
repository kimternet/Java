package chap_09;

public class _01_Overloading {

    // 여러개의 메소드를 만드는 것
    // 같은 이름의 메소드를 여러번 선언
    // 1. 전달값의 자료형 타입이 다르거나
    // 2. 전달값의 갯수가 다르거나



    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {   //  위 메소드와 전달값이 다름
        int number = Integer.parseInt(strNumber);    //  int number ! String strNumber
        return number * number;
    }

    public static int getPower(int number,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(getPower(3));
        System.out.println(getPower("4"));   // 자료형이 다른 메소드를 각각 호출
        System.out.println(getPower(3,3));
    }




}
