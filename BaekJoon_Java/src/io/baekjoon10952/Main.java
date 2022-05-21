package io.baekjoon10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringTokenizer st;

        while(true) {
             str = br.readLine();
             st = new StringTokenizer(str," ");

             int a = Integer.parseInt(st.nextToken());
             int b = Integer.parseInt(st.nextToken());

             if ( a == 0 & b == 0) {
                 return;
             }

             System.out.println( a + b );
        }
    }
}
