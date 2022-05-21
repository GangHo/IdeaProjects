package io.baekjoon2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for ( int i = 0; i < n; i ++) {
            for ( int j = i; j < n - 1; j++) {
                sb.append(" ");
            }

            for ( int s = 0; s < i; s++ ) {
                sb.append("*");
            }

            sb.append("*");

            for ( int t = 0; t < i; t++ ) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb);

    }
}
