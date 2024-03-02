package chap_05;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // Switch case
        // 석차에 따른 장학금 지급
        // 1등 : 전액
        // 2등 : 반액
        // 3등 : 반반액
        // 그 외: 장학금 대상 아님

        // If Else 문을 이용
        int ranking = 4; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // Switch Case 문을 이용
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println(("전액 장학금"));
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println(("반반액 장학금"));
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정 ( 1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본가격
        switch (grade){

        }
    }
}
