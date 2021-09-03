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
public class problem158A {


public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int k = sc.nextInt();
int count=0;
int []arrey = new int[n];
for(int i=0;i<n;i++){
arrey [i]= sc.nextInt();
}
n--;
k--;
 for(int i =0;i<=n;i++){
     if(arrey[i]>=arrey[k] && arrey[i]>0){
     count++;
     }
}
 System.out.print(""+count);
} }

