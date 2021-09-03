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
public class Binary_srch {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int left=0;
        int right=n-1;
        int mid;
       int []arrey= new int[n]; 
       int i=0;
       while(i<n){
       arrey[i]=sc.nextInt();
       i++;
       
      
           
    }int input =sc.nextInt();
    while(left<=right){
           mid=(left+right)/2;
       if(arrey[mid]==input){
       System.out.print(arrey[mid]);
       
       } 
       else if(arrey[mid]<input)
       { left=mid+1;}
       
       else{right=mid-1;}
     // System.out.println(arrey[mid]);
       }   System.out.print("not in here");
}}
