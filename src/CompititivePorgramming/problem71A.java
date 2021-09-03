/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;

public class problem71A
{
	

public static void main(String[]args){

Scanner sc =  new Scanner (System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
String s=sc.next();
if ( s.length() > 10){
    
s = s.charAt(0)+""+(s.length()-2)+s.charAt(s.length()-1);
 
System.out.println(s);}


else{
System.out.println(s);
}}
}}






