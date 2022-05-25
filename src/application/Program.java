package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> aa = new HashSet<>();
        Set<Integer> bb = new HashSet<>();
        Set<Integer> cc = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            aa.add(number);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            bb.add(number);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            cc.add(number);
        }


        Set<Integer> total = new HashSet<>(aa);
        total.addAll(bb);
        total.addAll(cc);

        System.out.println("Total students: " + total.size());







        sc.close();

    }
}
