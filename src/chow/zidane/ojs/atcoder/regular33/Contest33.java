package chow.zidane.ojs.atcoder.regular33;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * here lists all solutions to the questions of regular contest 33 at AtCoder
 * But question is not showed here, if you want more detail please access the home page of AtCoder
 */

public class Contest33 {

    static class A {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println(A.a(a));
            s.close();
        }

        public static int a(int a) {
            if (a == 1) {
                return 1;
            }
            return a + a(a - 1);
        }
    }

    /*
     * Here is the second question
     */
    static class B {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int na = in.nextInt();
            int nb = in.nextInt();
            double sumofinter = 0;
            Set<Integer> sum = new HashSet<>();
            for (int n = 0; n < na + nb; n++) {
                int temp = in.nextInt();
                if (sum.contains(temp)) {
                    sumofinter++;
                } else {
                    sum.add(temp);
                }
            }
            System.out.printf("%.10f", sumofinter / sum.size());
            in.close();
        }
    }

    /*
     * Here is the third question
     */

    static class C {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int query = in.nextInt();
            int[] a = new int[query];
            for (int n = 0; n < query; n++) {
                int c = in.nextInt();
                int v;
                if (c == 1) {
                    v = in.nextInt();
                    insert(a, v);
                }
            }

            in.close();
        }

        static void insert(int[] a, int value) {
            for (int n = 0; n < a.length; n++) {
                if (a[n] == 0) {
                    a[n] = value;
                    return;
                }
                if (a[n] >= value) {
                    int pos = n;
                    while (a[pos] != 0) {
                        int temp = a[pos + 1];
                        a[pos] = temp;
                        pos++;
                    }
                    a[n] = value;
                }
            }
        }
    }

}
