package Advanced_Chap_2;

import java.util.Scanner;
public class _2_3_Switch {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("오늘은 몇요일? ");
//        String name = scanner.nextLine();
//
//        System.out.println(name);
//
//
//    String day = "Friday";
//
//    switch(day.toLowerCase()){
//        case "sunday":
//            System.out.println("It's Sunday!");
//            break;
//        case "Monday":
//            System.out.println("It's Monday!");
//            break;
//        case "Tuesday":
//            System.out.println("It's Monday!");
//            break;
//        case "Wednesday":
//            System.out.println("It's Monday!");
//            break;
//        case "Thursday":
//            System.out.println("It's Monday!");
//            break;
//        case "Friday":
//            System.out.println("It's Monday!");
//            break;
//        case "Saturday":
//            System.out.println("It's Monday!");
//            break;
//    }
    //  위 코드가 실행이 되지 않은 이유 2가지
    //
    //  ***
    //  1.    String name = scanner.nextLine();
    //        System.out.println("오늘은 몇요일? ");
    //        System.out.println 이 scanner.nextLine();보다 먼저 와야한다


    //  2. *** Switch 에 대,소문자를 통일 시켜줘야 한다. 자바는 대소문자가 중요!!!! ***




        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘은 몇요일? ");
        String day = scanner.nextLine().toLowerCase();

        switch(day){
            case "sunday":
                System.out.println("It's Sunday!");
                break;
            case "monday":
                System.out.println("It's Monday!");
                break;
            case "tuesday":
                System.out.println("It's tuesday!");
                break;
            case "wednesday":
                System.out.println("It's wednesday!");
                break;
            case "thursday":
                System.out.println("It's thursday!");
                break;
            case "friday":
                System.out.println("It's friday!");
                break;
            case "saturday":
                System.out.println("It's saturday!");
                break;
        }



    }

}


