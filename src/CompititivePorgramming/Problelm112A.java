/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;
 import java.util.*;
public class Problelm112A {

public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String a=sc.next();
a=a.toLowerCase();
 String b = sc.next();
 b=b.toLowerCase();
 if(a.compareTo(b)<0){
 System.out.println("-1");}
 else if(a.compareTo(b)>0){
   System.out.print("1");
 }
 else{
 System.out.print("0");
 } 
}
}
