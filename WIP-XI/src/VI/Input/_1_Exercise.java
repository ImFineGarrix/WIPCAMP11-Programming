/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int x;
         int y;
         
        System.out.print("พ่อให้เงิน : ");

        x = sc.nextInt();
        
        System.out.print("แม่ให้เงิน : ");

        y = sc.nextInt();
               
        System.out.println("เงินรวม"
                + " : " + (x+y));
    }
}
