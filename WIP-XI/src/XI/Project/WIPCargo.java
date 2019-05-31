/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        int menu ;
        System.out.println("item : " + item);
        System.out.println("limit : " + limit);
        Scanner sc = new Scanner (System.in);
        System.out.println("1 for add item");
        System.out.println("2 for remove");
        System.out.println("3 for check item");
        menu = sc.nextInt();
        if (menu == 1){
            int amountAdd = 0;
            System.out.println("How many will you add : " );
            amountAdd = sc.nextInt();
            if (item + amountAdd <= limit){
                item = amountAdd + item ;
                System.out.println("Your amount of item in cago is :" + item);
                        
            }else {
            System.out.println("โกดังเต็มแล้ว!!");
        }
      
        } 
        if (menu == 2){
            int amountRemove = 0;
            System.out.println("How many will you remove : " );
            amountRemove = sc.nextInt ();
            if (item - amountRemove >= 0) {
                item = item - amountRemove ;
                System.out.println("Your amount of item in cago is :" + item);
                
            }else{
            System.out.println("ไม่สามารถเอาไอเท็มออกได้");
        }
        }
        if(menu == 3){
            System.out.println("ในโกดังมีอยู่" + item);
        }
        
}}
