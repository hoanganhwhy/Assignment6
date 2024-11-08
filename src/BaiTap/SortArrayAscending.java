
package BaiTap;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAscending {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xem tang dan: " + Arrays.toString(arr));
    }
}
