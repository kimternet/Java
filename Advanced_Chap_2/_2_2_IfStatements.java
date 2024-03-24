package Advanced_Chap_2;

public class _2_2_IfStatements {

    public static void main(String[] args) {

        int age = 17;

        if(age >= 18){
            System.out.println("You are an Adult!");
        } else if (age >= 75) {
            System.out.println("Ok boomer!");
        }
          else if (age >= 17){
                System.out.println("You are a teenager!");
            }
         else{
            System.out.println("You are not an Adult!");
        }
    }
}
