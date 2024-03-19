package Chap_2_1;
import java.util.Scanner;

public class _2_5_MathClass {

    public static void main(String[] args) {

//        double x = 3.14;
//        double y = -10;

        //double z = Math.max(x,y);  // 최대값
        //double z = Math.min(x,y);  // 최소값
        //double z = Math.abs(y);  // 절대값
        //double z = Math.abs(y);  // 절대값
//        double z = Math.sqrt(y);  // 제곱근
//        double z = Math.round(x);  // 반올림
//        double z = Math.ceil(x);  // 올림
//        double z = Math.floor(x);  // 내림




//        System.out.println(z);

        // sqrt의 -10이 Nan으로 출력되는 이유

        // 실수 범위에서 음수의 제곱근을 계산할 수 없다.
        // 실수에서 어떤 수의 제곱은 항상 0 또는 양수가 되야 한다.
        // 예를 들어, 2 * 2 = 4이고, -2 * -2 = 4처럼
        // 따라서 실수의 세계에서 -10 같은 음수는 제곱해서 나올 수 있는 결과가 아니기 때문


        // 빗변 찾는 프로그램 만들기

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);  // scanner 라이브러리 호출 import java.util.scanner;

        System.out.println("Enter side x : ");
        x = scanner.nextDouble();   //nextDouble()은 Scanner 클래스의 메소드로, 사용자로부터 소수점이 있는 숫자를 입력받는다.
                                    //이 메소드는 입력된 숫자를 double 타입으로 읽어서 프로그램에 전달한다.
                                    //사용자가 숫자를 입력하면, nextDouble()이 그 숫자를 컴퓨터가 이해할 수 있는 형태로 변환해준다
                                    //만약 int로 변수가 선언 되어있다면 Integer을 사용(Wrapperclass)
        System.out.println("Enter side y : ");
        y = scanner.nextDouble();


        z = Math.sqrt((x*x) + (y*y));

        System.out.println("빗변은 : " + z);

        scanner.close();

    }

}
