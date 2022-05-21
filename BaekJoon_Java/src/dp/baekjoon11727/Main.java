package dp.baekjoon11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;

        for (int i=3; i<num+1; i++) {
            dp[i] = i * (i-1) -1;
        }

        System.out.println(dp[num]);
    }
}
