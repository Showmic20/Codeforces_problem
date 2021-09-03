/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

/**
 *
 * @author swarup
 */
import java.util.*;
public class bubble_shot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arrey = new int[n];
       for(int k=0;k<n;k++){
       arrey[k]=sc.nextInt();
       
       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arrey[j] > arrey[j + 1]) {
                    int temp = arrey[j];
                    arrey[j] = arrey[j + 1];
                    arrey[j + 1] = temp;

                }

            }
        }for (int l=0;l<n;l++)
        System.out.println(arrey[l] );
    }
}
