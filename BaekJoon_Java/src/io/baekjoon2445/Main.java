package io.baekjoon2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {

                sb.append("*");
            }

            sb.append("\n");
        }
        for (int j = n - 1; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                sb.append("*");
            }
            for (int k = 1; k <= 2 * (n - j); k++) {
                sb.append(" ");
            }
            for (int k = 1; k <= j; k++) {
                sb.append("*");
            }

            sb.append("\n");

        }

        System.out.print(sb);

    }
}
