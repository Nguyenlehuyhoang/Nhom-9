package bai5;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Nhập số thứ hai: ");
            int num2 = scanner.nextInt();
            
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            
            System.out.println("Hai số theo thứ tự tăng dần:");
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
