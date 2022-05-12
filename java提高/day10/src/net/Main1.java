package net;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int n, q;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[][] = new int[q][3];
        for (int i = 0; i < q; i++) {
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();
            arr1[i][2] = sc.nextInt();

            if (arr1[i][0] == 1) {
                arr[arr1[i][1] - 1] = arr1[i][2];
            } else {
                int l = arr1[i][1];
                int r = arr1[i][2];
                int arr2[]=arr;
                int index = mex(arr2, l, r);
                System.out.println(index);
                if (index == r - l + 1) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
    }

    public static int mex(int[] arr, int l, int r) {
        Arrays.sort(arr, l - 1, r - 1);
        if(arr[l-1]>0)return 0;
        for (int i = l - 1; i < l - r + 1; i++) {
            if (arr[i] > i - 1) return i - 1;
        }
        return r - l + 1;
    }
}
