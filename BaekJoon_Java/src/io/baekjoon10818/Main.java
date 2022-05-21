package io.baekjoon10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int max = Integer.parseInt(st.nextToken());
        int min = max;

        for(int i=1; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(max < num) {
                max = num;
            }

            if(min > num) {
                min = num;
            }
        }

        sb.append(min).append(" ").append(max);

        System.out.println(sb);
    }
}