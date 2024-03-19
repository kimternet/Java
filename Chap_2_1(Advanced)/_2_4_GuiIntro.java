package Chap_2_1;

import javax.swing.JOptionPane;
// 사용자 인터페이스

public class _2_4_GuiIntro {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("HI What's your name? ");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("okay, how old are you? "));
        JOptionPane.showMessageDialog(null, "Wow " + age + "?? Really?? ");

        // Question

        // String name과 int age의 차이?

        // String은 객체 데이터 타입이고 int는 기본적인 데이터 타입이다.

        // String은 JOptionPane.showInputDialog() 메소드는 사용자로부터 텍스트 입력을 받을 때 사용되며,
        // 입력받은 텍스트를 String 타입으로 반환한다.
        // 그래서 이 메소드를 사용해 바로 String 타입의 변수에 저장할 수 있다.
        // 즉, showInputDialog() 메소드는 사용자로부터 이름을 문자열 형태로 입력받아 바로 name 변수에 저장하게 해준다.

        // 반면에 int는 기본적인 데이터 타입이다.
        // 사용자로부터 입력받은 데이터는 기본적으로 문자열(String) 형태로 JOptionPane.showInputDialog() 메소드에 의해 반환되기 때문에,
        // 이 문자열을 int 타입으로 변환해야 할 때가 있다.
        // 이런 상황에서 Integer.parseInt() 메소드가 사용된다.
        // 이 메소드는 문자열을 int 기본 데이터 타입으로 변환해주는 역할을 한다.
        // 사용자로부터 입력받은 나이(문자열)를 Integer.parseInt()를 통해 정수로 변환하고, 그 결과를 age 변수에 저장하게 된다





    }

}
