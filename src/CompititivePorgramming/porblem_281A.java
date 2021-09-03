/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;
import java.util.*;
public class porblem_281A {
    public static void main(String[]agrs){
    Scanner sc= new Scanner(System.in);
    String a = sc.next();
    
    if(Character.isLowerCase(a.charAt(0))){
    System.out.print(Character.toUpperCase(a.charAt(0))+a.substring(1));
    }
    else{
    System.out.print(a);
    }
    }
}
