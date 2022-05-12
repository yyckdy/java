package net;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N, K;
        int maxNum = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= K; i++) {
            int sum=0;
            for (int j = 0; j < N; j++) {
                sum+=arr[j]^i;
            }
            maxNum=Math.max(maxNum,sum);
        }
        System.out.println(maxNum);
    }
}