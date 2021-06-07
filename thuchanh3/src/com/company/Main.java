package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chiều dài ");
        width=scanner.nextFloat();
        System.out.println("nhập chiều rộng:");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("diện tích của hình chữ nhật là :" +area);
        
    }

}
