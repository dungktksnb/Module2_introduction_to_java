package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số a :");
        double a=scanner.nextDouble();
        System.out.println("nhập số b :");
        double b= scanner.nextDouble();
        System.out.println("nhập số c :");
        double c=scanner.nextDouble();
        if (a!=0){
            double nghiem=(c-b)/a;
            System.out.println("nghiệm chủa phương trình là :" +nghiem);
        }else if(b==c){
            System.out.println("phương trình vô số nghiệm ");

        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
