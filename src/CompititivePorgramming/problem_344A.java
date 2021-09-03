/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;
public class problem_344A {
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int count=1;
  int[]array = new int[n];
  for(int i =0; i<array.length;i++){
  array[i]=sc.nextInt();
  }
  for(int i=0;i<n-1;i++){
 if(array[i]!= array[i+1]){
 count++;
 
 }
  }
  System.out.print(count);
  }  
}
