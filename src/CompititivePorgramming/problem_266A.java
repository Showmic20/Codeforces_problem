/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;

public class problem_266A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String a = sc.next();
        char z=a.charAt(0);
        for (int j = 1; j < n; j++) {

            if (z == a.charAt(j)) {
                count++;
            }
            z = a.charAt(j);

        }

        System.out.println(count);
    }

}
