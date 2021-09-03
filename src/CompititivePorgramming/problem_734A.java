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
public class problem_734A {
    public static void main(String[]args){
    Scanner sc= new Scanner( System.in);
    int n= sc.nextInt();
   int Antu=0;
   int Dipu=0;
   // char []arrey= new char[n];
 String s=sc.next();
 char[]c=s.toCharArray();
 for(int i=0;i<n;i++){
 if(c[i]=='A'){
 Antu++;
 }else{Dipu++;}
 
 }if(Antu>Dipu) System.out.print("Anton");
 else if(Antu==Dipu) System.out.print("Friendship");
 else System.out.print("Danik");
    }
    }

