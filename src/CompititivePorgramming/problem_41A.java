/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

/**
 *
 * @author swarup
 */
import java.util.*;

public class problem_41A {

    String k = "";

    public static void main(String[] args) {
        problem_41A obj = new problem_41A();
        obj.compare();
        //System.out.print(obj.k);

    }

    void compare() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        s = s.toLowerCase();
        t = t.toLowerCase();
        for (int i = s.length() - 1; i >= 0; i--) {
            char[] c = s.toCharArray();
            k += c[i];
        }

        if (k.compareTo(t)==0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }

}
