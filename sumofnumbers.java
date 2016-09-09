package zlab1;

import java.util.Scanner;

/**
 * Created by abijah on 9/9/16.
 */
public class sumofnumbers {

    public static void main(String[] args) {
        System.out.println("Enter a positive #");
        Scanner input = new Scanner(System.in);

        int n =input.nextInt();

        int sum = 0;
        for (int i =0; i < n; i++) {
            sum += i;
        }

            System.out.println("the sum is =" + sum);


        }


    }


