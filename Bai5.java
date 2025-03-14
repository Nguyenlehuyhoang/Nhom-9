
package bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Nhập số thứ hai: ");
            int num2 = scanner.nextInt();
            
            int gcd = findGCD(num1, num2);
            
            System.out.println("Ước số chung lớn nhất (USCLN) của " + num1 + " và " + num2 + " là: " + gcd);
        }
    }
    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}