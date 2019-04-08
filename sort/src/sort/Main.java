package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int[] arr = new int[num];
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			int flag = sc.nextInt();
			int[] a = new int[num];

			Arrays.sort(arr);
					
			if (flag == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			} else if (flag == 1) {
				for (int i = 0; i < a.length; i++) {
					a[i] = arr[arr.length - i - 1];
					System.out.print(a[i] + " ");
				}
			}
			sc.close();
		}
	}
}

