import java.net.SocketTimeoutException;
import java.util.*;

class Letsgrade {
    static int sol(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            int count = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c = c + 1;
                }
            }
            if (c > (n / 2)) {
                // System.out.println(arr[i]);
                c = arr[i];
                return c;
                // count=c;
                // System.out.println(c);

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = sol(arr, n);
        System.out.println("maximum count is");
        System.out.println(ans);
    }
}
