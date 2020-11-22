package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {

    public static boolean[] primes(int n) {
        boolean [] prime = new boolean[n+1];
        for (int p = 2; p*p < n; p++) {
            if (!prime[p]) {
                for (int i = p*p; i<=n; i+=p)
                    prime[i] = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) throws IOException {
        int n = 10000010;
        boolean[] prime = primes(n);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String s = br.readLine();
        String[] c = s.split(" ");
        int d=Integer.parseInt(c[0]);
        for (int i = 1; i <= d; i++) {
            s=br.readLine();
            c=s.split(" ");
            int a = Integer.parseInt(c[0]);
            if (a<=2) {pw.println(2);}
            else if (a<=4) {pw.println(3);}
            else {
                    for (int j = a, k = a; ; k--, j++) {
                        if (!prime[k]) {
                            pw.println(k);
                            break;}
                        if (!prime[j]) {
                            pw.println(j);
                            break; }
                }
            }
        }
        pw.close();
        br.close();
    }
}
