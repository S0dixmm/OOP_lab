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
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        float weight = sc.nextFloat();
        float salary = 0;
        float salary2 = 0;
        int age = sc.nextInt();
        float numDay1 = sc.nextFloat();
        float numDay2 = sc.nextFloat();
        if (age >= 21 && age <= 30){
            salary = (numDay1*300)-(numDay2*50);
        }
        if (age >= 31 && age <= 40){
            salary = (numDay1*500)-(numDay2*50);
        }
        if (age >= 41 && age <= 50){
            salary = (numDay1*1000)-(numDay2*25);
        }
        if (age >= 51 && age <= 60){
            salary = (numDay1*3000);
        }
        if (weight >= 10 && weight <= 60){
            salary2 += salary + 5000;
        }
        if (weight >= 61 && weight <= 90){
            salary2 += salary + (5000-((weight-60)*10));
        }
        System.out.print("Please insert your name : ");
        System.out.println(name);
        System.out.print("Please insert your age : ");
        System.out.println(age);
        System.out.print("Please insert your number of working days : ");
        System.out.println(numDay1);
        System.out.print("Please insert your number of absent days : ");
        System.out.println(numDay2);
        System.out.print("Please insert your body weight : ");
        System.out.println(weight);     
        System.out.println("Hi, " + name);
        System.out.print("Your salary is " + salary);
        System.out.println("Baht");
        System.out.print("Your salary and bonus is " + salary2);
        System.out.println(" Baht");
    }
}
