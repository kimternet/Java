package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If

        int hour = 10; // 오전 10시
        /*if ( 조건 )
        ... 수행할 명령 ...*/

        // -------------참일 경우 ---------------
        if (hour < 14)
            System.out.println("hour아이스 아메리카노 +1");
        System.out.println("hour샷추가");
        System.out.println("hour커피 주문 완료");

        // -------------거짓일 경우 ---------------
        int hour1 = 15;
        if (hour1 < 14)
            System.out.println("hour1아이스 아메리카노 +1");
        System.out.println("hour1샷추가");
        System.out.println("hour1커피 주문 완료");

        // 샷추가 제외 -> " { " 필요

        int hour2 = 15;
        if (hour2 < 14){
            System.out.println("hour2아이스 아메리카노 +1");
            System.out.println("hour2샷추가");
        }
        System.out.println("hour2커피 주문 완료");

        // if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        // 두개의 문장일 경우는 { } 필수
        int hour3 = 15;
        if (hour3 < 14)
            System.out.println("아이스 아메리카노 +1");

        // 오후 2 시 이전, 모닝 커피를 마시지 않은 경우!
        int hour4 = 10;
        boolean morningCoffe = false;
        if(hour < 14 && morningCoffe == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후이거나 모닝 커피를 마신 경우
        int hour5 = 15;

        boolean morningCoffe2 = true;

        if (hour >= 14 || morningCoffe2 == true){
            System.out.println("아이스 아메리카노 (디카페인) +1");

        }
        System.out.println("커피 주문 완료");

    }
}
