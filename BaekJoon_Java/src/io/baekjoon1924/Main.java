package io.baekjoon1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
         int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         String[] day = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int total = 0;
        for (int i=0; i<x-1; i++) {
            total += month[i];
        }

        total += y;

        String result = day[(total % 7)];

        System.out.println(result);
    }
}
