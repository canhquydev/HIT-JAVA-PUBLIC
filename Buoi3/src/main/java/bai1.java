import java.util.Scanner;

public class bai1 {
    public static final String vuong = "Square";
    public static final String tamgiac = "Triangle";
    public static final String tron = "Circle";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int a, b, c, r;
        str = scanner.nextLine();
        if(str.equals(vuong)){
            do{
                a = scanner.nextInt();
            }while (a <= 0);
            System.out.println(Math.pow(a, 2));
        }
        else if(str.equals(tamgiac)){
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if(a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0){
                System.out.println(-1);
            }
            else {
                double p = (double)(a + b + c) / 2;
                System.out.printf("%.2f", Math.sqrt(p*(p - a)*(p - b)*(p - c)));
            }
        }
        else if(str.equals(tron)){
            do{
                r = scanner.nextInt();
            }while (r <= 0);
            System.out.printf("%.2f", Math.pow(r, 2) * Math.PI);
        }
        else {
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
