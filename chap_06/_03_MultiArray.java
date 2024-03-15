package chap_06;

import java.sql.SQLOutput;

public class _03_MultiArray {
    public static void main(String[] args) {

//        // 다차원 배열 (2차원 배열)
//
//        // 소규모 영화관 좌석
//        // A1 - A5
//        // B1 - B5
//        // C1 - C5
//
//        String[] seatA = {"A1","A2","A3","A4","A5"};
//        String[] seatB = {"B1","B2","B3","B4","B5"};
//        String[] seatC = {"C1","C2","C3","C4","C5"};
//
//
//        // 3 x 5 크기의 2차원 배열
//        String[][] seats = new String[][]{
//                {"A1","A2","A3","A4","A5"},
//                {"B1","B2","B3","B4","B5"},
//                {"C1","C2","C3","C4","C5"}
//        };
//
//        // B2에 접근하려면 ?
//        System.out.println(seats[1][1]);
//
//        // C5는 ?
//
//        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 4칸, 세째 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };


        for (int i = 0; i < seats2.length; i++) {   // seats2.length를 통해 괄호안의 배열의 길이를 보는것
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");


        // A3 에 접근하라

        System.out.println(seats2[0][1]);

        // A5 에 접근하려면?  ->  없는 배열에는 접근 x
        // System.out.println([0][4]);

        // 3차원 배열 만들기  ( 세로 x 가로 x 높이)
        String[][][] marray = new String[][][]{
                {{"A1","A2"},{"B1","B2"},{"C1","C2"}},  // 1층
                {{"D1","D2"},{"E1","E2"},{"F1","F2"}},  // 2층
                {{"G1","G2"},{"H1","H2"},{"I1","I2"}},  // 3층
        };
                // 3층에 3호실 "I2"씨를 호출하세요!

        System.out.println(marray[2][2][1]);

    }
}
