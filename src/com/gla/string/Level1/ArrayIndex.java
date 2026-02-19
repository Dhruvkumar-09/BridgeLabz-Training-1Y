package com.gla.string.Level1;
import java.util.Scanner;

public class ArrayIndex {

    public static void generate(String[] a){
        if(a.length > 0){
            System.out.println(a[a.length - 1]);  // last element
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void handle(String[] a){
        try{
            if(a.length > 0){
                System.out.println(a[a.length - 1]);  // last element
            } else {
                System.out.println("Array is empty");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.next();
        }

        generate(a);
        handle(a);

        sc.close();
    }
}
