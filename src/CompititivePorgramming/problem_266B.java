/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;

/**
 *
 * @author swarup
 */
public class problem_266B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        for (int k = 0; k < t; k++) {
            for (int j = 0; j < n-1 ;j++ ) {
                if ((s.charAt(j) == 'B') && (s.charAt(j + 1) == 'G')) {
                    char[] myname = s.toCharArray();

                    myname[j] = 'G';
                    myname[j + 1] = 'B';
                    s = String.valueOf(myname);
                    j++;
                    
                }
            }

        }
        System.out.print(s);
    }
}
