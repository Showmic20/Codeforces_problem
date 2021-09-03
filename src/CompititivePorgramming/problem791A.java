/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;
import java.util.*;
public class problem791A {
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int count=1;
    for (int i =0; i<=10;i++){
    l= l*3;
    b=b*2;
    if(l<=b){
        count++;
    continue;
    }
    else{
    break;
    }
    
    }
    System.out.println(count);
    }
}
