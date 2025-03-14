
package bài.pkg3;

import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();
            
            if (isPalindrome(number)) {
                System.out.println(number + " là số đối xứng.");
            } else {
                System.out.println(number + " không phải là số đối xứng.");
            }
        }
    }
    
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }
}
