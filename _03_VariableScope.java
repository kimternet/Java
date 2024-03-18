package chap_09;

public class _03_VariableScope {

    // 중괄호 즉, 지역내에서는 변수 사용이 가능하나
    // 벗어나게 되면 사용 불가

    public static void methodA(){
        //System.out.println(number); X
        //System.out.println(result); X
    }

    public static void methodB(){
        int result = 1;  // 지역 변수
    }



    public static void main(String[] args) {

        int number = 3;

        //System.out.println(result);  X

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // X
        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);  // X
    }
}
