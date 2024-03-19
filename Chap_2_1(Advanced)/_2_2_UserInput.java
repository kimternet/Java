package Chap_2_1;

import java.util.Scanner;

public class _2_2_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("너의 이름은?");


        System.out.println(name);




//        System.out.println("몇살?");
//        int age = scanner.nextInt();
//
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//        System.out.println("당신의 이름은 "+name);
//        System.out.println("나이는 약 " + age + "추정");
//        System.out.println("좋아하는 음식은? " + food);

        //Scanner 클래스를 사용할 때 주의해야 할 몇 가지 중요한 점이 있습니다. 특히 nextLine() 메소드를 사용할 때는 더욱 주의해야 하는데,
        // 이는 다른 Scanner 메소드와의 상호 작용에서 발생할 수 있는 문제 때문입니다.
        //
        //다른 Scanner 메소드 후에 nextLine() 사용하기:
        //
        //Scanner 클래스의 nextInt(), nextDouble() 같은 메소드는 입력 스트림에서 다음 토큰을 읽어오지만,줄의 끝까지는 읽지 않습니다.
        // 즉, 숫자를 입력하고 엔터를 치면 엔터(줄 바꿈 문자)는 입력 스트림에 남아 있게 됩니다.
        // 이 상태에서 nextLine()을 호출하면, 남아 있는 줄 바꿈 문자를 즉시 읽고 빈 문자열을 반환하게 됩니다.
        // 이는 종종 개발자가 의도하지 않은 결과를 초래합니다.

    }
}
