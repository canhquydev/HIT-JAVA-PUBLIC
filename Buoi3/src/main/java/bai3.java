import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        d = (int)(Math.random() * 2);
        if(d == 1){
            do{
                a = (int)(Math.random() * 11);
                b = (int)(Math.random() * 11);
                c = (int)(Math.random() * 21);
            }while (a + b == c);
        }
        else {
            do{
                a = (int)(Math.random() * 11);
                b = (int)(Math.random() * 11);
                c = (int)(Math.random() * 21);
            }while (a + b != c);
        }
        System.out.println(a + " + " + b + " = " + c);
        System.out.print("Phép tính trên đúng hay sai (Y/N): ");
        String result;
        result = scanner.nextLine();
        if(((a + b == c) && result.equals("Y")) || ((a + b != c) && result.equals("N"))){
            System.out.println("Chính xác!");
        }
        else{
            System.out.println("Sai!");
        }
    }
}
