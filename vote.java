/* 
import java.util.*;
class vote {
    public static void age(int age){
        if(age>18){
            System.out.println("you are eligible for voting:");
        }else{
            System.out.println("you are not eligible for voting:");
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age:");
        int age=sc.nextInt();
        age(age);
    }
    }

 */

import java.util.*;
class vote {
    public static boolean age(int age){
        if(age>18){
            return true;
        }else{
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age:");
        int age=sc.nextInt();
        System.out.println(age(age));
    }
    }

