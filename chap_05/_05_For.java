package chap_05;

public class _05_For {
    public static void main(String[] args) {

        // 반복문 For
        // A 매장
        System.out.println("어서오세요! A입니다.");
        // 또 다른 손님이 들어오면?
        // 인사 법이 바뀌면?

        System.out.println(" 환영합니다. A입니다.");

        // 매장 이름이 바뀌면 ?
        // A->B

        System.out.println("환영합니다. B입니다.");

        // 반복문 사용 For
      /*for ( 선언; 조건; 증감 ){


        }*/
        System.out.println("----반복문 사용-----");
        for (int i = 0; i < 10; i++ ){
            //System.out.println("어서오세요. A입니다" + i);
            //System.out.println("환영합니다. A입니다" + i);
            System.out.println("환영합니다. B입니다" + i);
        }

        // 짝수만 출력 ( fori만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);  // ln을 빼면 줄바꿈없이 출력된다
        }

        //홀수만 출력
        // 1, 3, 5, 7, 9

        for (int i = 1; i < 10; i += 2){
            System.out.println(i);

        }

        //거꾸로 숫자
        // 5, 4, 3, 2, 1

        for (int i =5; i > 0 ; i -- ) {

            System.out.println(i);

        }
        // 1~10 더하기
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
            System.out.println(sum);

        }

    }
}
