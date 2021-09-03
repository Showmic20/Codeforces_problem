/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;
public class porblem_110A {
   public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   //int n= sc.nextInt();
  String s=sc.next();
  int count=0;
   //String s=Integer.toString(n);
   //System.out.print(s.length());
   
   for (int i=0;i<s.length();i++){
       if(s.charAt(i)=='4'|| s.charAt(i)=='7'){
       count++;
           
       } 
   }if(count==4||count ==7){
       
       System.out.print("YES");
       }
   else{System.out.print("NO");}
   } 
}
