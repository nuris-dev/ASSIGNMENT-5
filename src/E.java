import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0;i < n - 1; i++) {
            if (arr[i] * arr[i + 1] > 0) {
                found = true;
            }
        }
        if (found){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


