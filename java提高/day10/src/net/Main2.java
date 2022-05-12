package net;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>() {{
            put(0, 0);
            put(1, 2);
            put(2, 5);
            put(3, 5);
            put(4, 4);
            put(5, 5);
            put(6, 6);
            put(7, 3);
            put(8, 7);
            put(9, 6);
        }};
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        String[] dp = new String[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = "";
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= map.get(nums[j])) {
                    if (!Objects.equals(dp[i - map.get(nums[j])], "") || i == map.get(nums[j])) {
                        String res = dp[i - map.get(nums[j])] + String.valueOf(nums[j]);
                        if (dp[i].length() < res.length() || (dp[i].compareTo(res) < 0 && dp[i].length() == res.length())) {
                            dp[i] = res;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n]);
    }
}

