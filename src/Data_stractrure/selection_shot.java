/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

import java.util.*;

/**
 *
 * @author swarup
 */
public class selection_shot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int[] arrey = new int[6];
        arrey[0] = 2;
        arrey[1] = 6;
        arrey[2] = 4;
        arrey[3] = 5;
       arrey[4] = 8;

     for (int i = 0; i < 5; i++) {
            int index_min = i;
            for (int j = i + 1; j < 5; j++) {
                if (arrey[j] > arrey[index_min]) {
                    index_min = j;
                }
            }
            if (index_min != i) {
                int temp = arrey[i];
                arrey[i] = arrey[index_min];
                arrey[index_min] = temp;
            }
        }
        System.out.print(arrey[0]+""+arrey[1]+""+arrey[2]+""+arrey[3]+""+arrey[4]);
    }
}
