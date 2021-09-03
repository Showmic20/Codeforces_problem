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


public class probelm236A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        //int z = a.length();
        int count = 0;
        
      Set<Character> charset= new java.util.HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            charset.add(a.charAt(i));

            }
 if(charset.size()%2==0){
        System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");}
       // System.out.println(z);

            //z=a.charAt(i);
        }
        
       
    }

