package io.baekjoon10992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            for (int k=i; k<=n-1; k++) {
                sb.append(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j==2*i-1 || i==n) {
                    sb.append("*");
                    continue;
                }
                else sb.append(" ");
            }
            sb.append("\n");

        }

        System.out.println(sb.toString());
    }
}
