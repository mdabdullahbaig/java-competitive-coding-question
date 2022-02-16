import java.util.Scanner;

public class FIndMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        taking length of the array
        int n = sc.nextInt();

//        creating a integer array of length n
        int[] arr = new int[n];

//        taking array values
        for(int i=0; i<n-1; i++) {
           arr[i] = sc.nextInt();
        }

       int sum = ((n)*(n+1))/2;

        for (int i=0; i<n-1; i++) {
            sum -= arr[i];
        }

//        print the missing number
        System.out.println(sum);
    }
}
