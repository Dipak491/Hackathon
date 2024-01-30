import java.util.Scanner;

public class FindFood {

    public static int Solution(int n, int unit, int r, int arr[]) {

        if (arr == null) {
            return -1;
        }

        int sum = 0;
        int count = 0;
        int totalfood = r * 2;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= totalfood) {
                break;
            }

        }

        if (sum < totalfood)
            return 0;
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Solution(r, unit, n, arr));

    }

}
