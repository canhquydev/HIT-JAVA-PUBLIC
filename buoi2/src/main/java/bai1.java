import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14, r, P, S;
        do {
            r = scanner.nextDouble();
        }while(r <= 0 || r >= 1000);
        P = 2*r*pi;
        S = r*r*pi;
        System.out.printf("%.3f %.3f%n", P, S);
    }
}
