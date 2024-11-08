
package BaiTap;

import java.util.Scanner;


public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhap phan tu can dem: ");
        int target = scanner.nextInt();
        int count = 0;

        for (int value : arr) {
            if (value == target) count++;
        }

        System.out.println("So lan xuat hien cua " + target + " la: " + count);
    }
}
