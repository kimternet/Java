package chap_07;

public class _01_ASCII {
    public static void main(String[] arg){

        // 아스키 코드 (ANSI) 미국 표준 협회에서 정한 미국 표준 코드

        char c = 'A';  // 알파벳 대문자 A는 65부터 시작, 소문자는 97부터 시작, 숫자 48부터 시작
        System.out.println(c);
        System.out.println((int)c);


        c = 'B';

        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);


        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);

            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");

            }
            System.out.println();
        }
    }
}