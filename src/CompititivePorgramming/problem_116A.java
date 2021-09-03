/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;
public class problem_116A {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int n =sc.nextInt();
    int[][] arrey= new int[n][2] ;
    int a = 0;
    int c=0;
    int count=0;
   for (int i=0;i<n;i++){
  arrey [i][0]=sc.nextInt();
   arrey [i][1]=sc.nextInt();
     
   }
 int j=0;
  while(j<=n--){    
  int b=arrey[j][1]-arrey[j+1][0];
         arrey[j+1][1]=b+arrey[j+1][1];
         if(arrey[j+1][1]>=c){
 c=arrey[j+1][1];
 
         }
        //a=arrey[j+1][1];
        
    j++;
    
    }
  
System.out.print(c);
   
    }
}
