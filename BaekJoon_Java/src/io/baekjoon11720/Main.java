package io.baekjoon11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String strNums = br.readLine();
        int sum = 0;

        for( int i=0; i<len; i++) {
            sum += strNums.charAt(i)-48;
        }



        System.out.println(sum);

    }
}
