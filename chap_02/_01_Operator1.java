package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술연산자

        //일반연사
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 3);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2); // 나머지 값

        // 우선 순위 연산값

        System.out.println(2+ 2* 2); // 6
        System.out.println((2+2)*2);

        // 변수를 이용한 연산

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++ , --

        int val;
        val = 10;
        System.out.println(val); // 10
        //val++;  //  출력하고 1 연산
        //++val;  // 1 을 먼저 연산하고 출력
        System.out.println(++val);  // 11
        System.out.println(val);  // 11

        val = 10;

        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val--);
        System.out.println(val);
    }
}
