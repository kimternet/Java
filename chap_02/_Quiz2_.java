package chap_02;

import java.sql.SQLOutput;

public class _Quiz2_ {
    public static void main(String[] args) {

        int height = 135;

        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";

        System.out.println("xx놀이동산에 오신 것을 환영합니다.");
        System.out.println("놀이기구 탑승 전 안전을 위해 탑승 가능 여부를 확인하겠습니다.");
        System.out.println("키가 120cm 이상인 경우에만 탑승 가능하니 안전을 위해 협조 부탁드리겠습니다.");

        System.out.println("키가 " + height + "cm 이므로 " + result);









    }
}
