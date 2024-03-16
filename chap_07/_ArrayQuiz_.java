package chap_07;

public class _ArrayQuiz_ {
    public static void main(String[] args) {

            //    * 다차원 배열로 문제 해결할 것 *
            // 1. 사이즈 250~295 까지의 신발을 판매할 예정
            // 2. 사이즈는 5단위 증가 (Ex. 250,255, 260, 265...)
            // 3. 배열 과 for문 사용
            // 1. 250부터 295까지는 5개의 세로 배열이 필요 250, 260, 270, 280, 290(세로)
            // 2. 5단위 증가는 2개의 가로 배열이 필요 250, 255
            // 3.   250 255
            //      260 265
            //      270 275
            //      280 285
            //      290 295
            // => 배열로 가로 x 세로 [5][2]의 공간부터 만들기
            //    배열에 사이즈 넣어주기
//        String [][] size = new String[][]{
//            {"250","255"},
//            {"260","265"},
//            {"270","275"},
//            {"280","285"},
//            {"290","295"},
//        };
//
//        for (int i = 0; i < size.length; i++) {
//            for (int j = 0; j < 2; j++) {
//
//                System.out.print(size[i][j]);
//            }
//            System.out.println();

        // ----------------------

        //   5씩 증가해주는 프로그램으로 만들 순 없을까?

//        String[][] size2 = new String[5][2];
//        int shoose = 250;
//
//        for (int i = 0; i < size2.length; i++) {
//            for (int j = 0; j < size2.length; j++) {
//                size2[i][j] = String.valueOf(shoose) + (j +1);
//
//
//            }
//                shoose++;
//        }
//        for (int i = 0; i < size2.length; i++) {
//            for (int j = 0; j < size2[i].length; j++) {
//                System.out.print(size2[i][j] + " ");
//            }
//           System.out.println();
//
        // ================  틀렸다   =====================
        // ========= 틀린 이유 와 문제 해설 =================


            int[] sizeArray = new int[10];    // String이 아닌 int 로 배열
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);  // 250 기본값을 주고 5의 배수를 더해서 사이즈 값 출력

        }
        for(int size :                      // foreach 함수
                sizeArray) {                // 배열의 각 요소를 순회하며 해당 요소에 대해 어떤 동작을 수행하고자 할 때 사용하기에 적합
            System.out.println("사이즈 " + size + " (재고 있음)");

        }
        // ================= 다차원 배열로 만든다면?  ======================

//        int[][] sizeMultiArray = new int[10][2];
//        for (int i = 0; i < sizeMultiArray.length; i++) {
//            sizeMultiArray[i][0] = 250 + (5 * i);
//
//        }
//        for (int i = 0; i < sizeMultiArray.length; i++) {
//            System.out.print(sizeMultiArray[i][0]+ "재고 있음");
//        }
//
//        // ========== 한 줄에 2개씩 출력하고 싶다면 ??? ===============
//
            int[] sizeArray2 =new int[10];
        // 배열에 값채우기
        for (int i = 0; i < sizeArray2.length; i++) {
            sizeArray2[i] = 250 + (5 * i);
        }

        // 한 줄에 두 개의 사이즈 값을 출력하기
        for (int i = 0; i < sizeArray2.length; i+=2) {  // i += 2  여기서 1, 2를 선택하여 출력의 형태를 바꿀 수 있다.
            // 첫 번째 반복에서 i = 0: 250 (인덱스 0의 요소)
            // 두 번째 반복에서 i = 2: 260 (인덱스 2의 요소)
            // 세 번째 반복에서 i = 4: 270 (인덱스 4의 요소)

            // 마지막 요소 처리를 위한 조건 검사

            if (i + 1< sizeArray2.length){
                System.out.println(sizeArray2[i] + "," + sizeArray2[i+1]);
            } else {
                // 배열 길이가 홀수인 경우, 마지막 요소를 단독으로 출력
                System.out.println(sizeArray2[i]);   //  <- 확장성 홀수가 발생할 수 도 있기에 오류 방지를 위한 코드
            }

        }

    }

}





