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
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary2 = 0;
        Float salary = sc.nextFloat();
        if (salary > 500000){
            salary2 = ((salary*10)/100);
        }else if (salary <= 500000){
            salary2 = ((salary*5)/100);
        System.out.println(salary2);
        }
    }
}
