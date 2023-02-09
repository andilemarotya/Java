package Recurrsion;

public class Recurrsion {

    static int CalFactorial(int n) {

        //Break case
        if (n == 1) {
            return 1;
        } else {
            return (n * CalFactorial(n - 1));               //Recursion state
        }
    }
    public static void main(String[] args){
        System.out.println(CalFactorial(3));
    }


}
