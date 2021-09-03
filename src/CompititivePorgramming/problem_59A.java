package CompititivePorgramming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swarup
 */
import java.util.*;
public class problem_59A {
 public static void main(String[]args){
 Scanner sc= new Scanner (System.in);
 String s= sc.next();
 int upercase=0;
int lowercase=0;
 
 for (int i=0;i<s.length();i++){
 if (s.charAt(i)>='A'&& s.charAt(i)<='Z'){
 upercase++;
 }
 if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
 lowercase++;
 }
 
 }
 if(upercase>lowercase){
 s=s.toUpperCase();
 }
 else{
 s=s.toLowerCase();
 } System.out.print(s);
 }   

}
