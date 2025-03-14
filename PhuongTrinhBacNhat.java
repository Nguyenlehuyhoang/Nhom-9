import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap b: ");
            double b = scanner.nextDouble();
            
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiem cua phuong trinh la x = " + x);
            }
        }
    }
}