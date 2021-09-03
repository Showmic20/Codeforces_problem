/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

/**
 *
 * @author swarup
 */ import java.util.*;
public class problem_231A {
   
public static void main (String[]args){
    int count=0;
 
 Scanner sc = new Scanner(System.in);

 int x = sc.nextInt();
 for (int i=0; i<x ; i++) {
    
     int a = sc.nextInt();     
     int b = sc.nextInt();
     int c = sc.nextInt();
     int y =a+b+c;
     if (y==2||y==3){
        
        count++;
     }   
 }
  System.out.print(count);
}
}
