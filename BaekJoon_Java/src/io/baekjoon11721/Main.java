package io.baekjoon11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String result;
        int n=0;
        int len = str.length();
        while(true) {
            if(10*(n+1) > len) {
                result = str.substring(10*n,len);
                sb.append(result).append("\n");
                break;
            } else {
                result = str.substring(10*n,10*(n+1));
                sb.append(result).append("\n");
            }

            n += 1;
        }
        System.out.println(sb);
    }
}
