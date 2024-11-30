/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author User
 */
import java.util.*;
public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        sc.nextLine();
        String bank = sc.nextLine();
        double money2 = 0;
        if (bank.equals("A")|| bank.equals("C")){
            money2 = money*1.5;
        } else if (bank.equals("B")){
            money2 = (money*2)/100;
        } else if (bank.equals("X")){
            money2 = (money*5)/100;
            }
        System.out.println("Input your money : " + (int)money);
        System.out.println("Input your account type (Please type A B C or X in uppercase : " + bank);
        System.out.println("money in one year = " + (int)(money+money2));
    }
}
