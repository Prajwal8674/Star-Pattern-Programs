package PATTERN_2;
//  *
//  * *0
//  * * *
//  * * * *
//  * * * * *

public class Soln {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
