/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;
public class porblem282A {
  public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int x=0;


for(int i=0;i<n;i++){
String a= sc.next();


if (a.charAt(0)=='X'&& a.charAt(1)=='+'){
x++;
}
else if(a.charAt(0)=='+'){
x++;
}
else if(a.charAt(0)=='-'){
x--;
}else{x--;}
}
System.out.print(x);
  }}
