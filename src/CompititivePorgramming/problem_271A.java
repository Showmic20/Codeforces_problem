/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

/**
 *
 * @author swarup
 */
import java.util.*;
public class problem_271A {
    public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
  //for(int i=0;i!=-1;i++){
  //n++;
  String s= Integer.toString(n);
  Set <Character> charset= new java.util.HashSet<>();
  for(int j=0;j<s.length();j++){
  charset.add(s.charAt(j));
  }System.out.println(charset);
  
    }  }


