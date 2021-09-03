/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;

public class problem_617A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int m= n-1;
        int o = n-2;
        int k= n-3;
        int l = n-4;
        if ( m %5==0) {
             a =m / 5;
             System.out.print(a+1);
        } else if (o % 5 == 0) {
             a =o / 5;
             
             System.out.print(a+1);
        } else if (k % 5 == 0) {
             a = k / 5;
             System.out.print(a+1);
        } else if (l % 5 == 0) {
             a = l / 5;
             System.out.print(a+1);
        } 
                else{
            a= n/5;
            System.out.print(a);}
        
    }
}
