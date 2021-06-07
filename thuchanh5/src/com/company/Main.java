package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("bạn hãy nhập số tháng :");
            int month = scanner.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("tháng" + month + "có 31 ngày ");
                    break;
                case 2:
                    System.out.println("tháng " + "" + month + " có 28 hoăc 29");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("tháng " + month + " có 30 ngày ");
                    break;
                default:
                    System.out.println("tháng nhập không hợp lệ(tháng từ 1-12)");
            }
        } while (true);
    }
}

