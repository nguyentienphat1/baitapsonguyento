import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x = scanner.nextInt();
        if (x < 2) {
            System.out.println("khong phai snt");
        }
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println("la so snt");
        } else {
            System.out.println("nguoc lai");
        }
    }
}