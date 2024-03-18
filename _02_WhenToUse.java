package chap_09;

public class _02_WhenToUse {

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {


        // 메소드가 필요한 이유

        // 코드의 중복을 피할 수 있다.

        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;

        }
        System.out.println(result);

        // 3의 3승을 구하기

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;

        }
        System.out.println(result);   //3 * 3 * 3 = 27;


        result = 1;
        for (int i = 0; i < 4; i++) {
            result *= 4;

        }
        System.out.println(result);   //4 * 4 * 4 = 256;


        // 위의 복잡한 코드 구조를 아래처럼 사용 가능

        System.out.println(getPower(2, 2));
        System.out.println(getPower(3, 3));
    }
}
