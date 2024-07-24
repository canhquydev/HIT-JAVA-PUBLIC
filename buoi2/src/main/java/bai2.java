import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(i % 2 == 1){
                if(i == (n-1)){
                    arr[i] += arr[i-1];
                }
                else{
                    arr[i] += Math.abs(arr[i-1] - arr[i+1]);
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
