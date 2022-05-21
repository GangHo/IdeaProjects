package io.baekjoon2739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(scanner.next());

        for (int i=1; i<10; i++) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
        }

        System.out.println(sb);
    }
}
