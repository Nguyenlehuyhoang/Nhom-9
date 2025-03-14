
package bài.pkg3;

import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số thứ nhất: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Nhập số thứ hai: ");
            double num2 = scanner.nextDouble();
            
            double minNumber = Math.min(num1, num2);
            
            System.out.println("Số nhỏ nhất là: " + minNumber);
        }
    }
}
