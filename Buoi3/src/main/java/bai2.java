import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int length, cnt = 0;
        str = scanner.nextLine();
        length = str.length();
        if(length % 2 == 0){
            System.out.println(str.toLowerCase());
        }
        else {
            for(int i = 0; i <= (length / 2); i++){
                char s1, s2;
                s1 = str.charAt(i);
                s2 = str.charAt(length - 1);
                if(s1 == s2){
                    cnt++;
                }
                else {
                    System.out.println(str.toLowerCase());
                    cnt = 0;
                    break;
                }
                length--;

            }
            if (cnt != 0){
                System.out.println(str.toUpperCase());
            }
        }
    }
}
