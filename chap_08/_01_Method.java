package chap_08;

    // 메소드 (코드들의 묶음)
    // x -> ㅁ + 3 -> y

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }



    public static void main(String[] args) {
    // 메소드 호출

        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
