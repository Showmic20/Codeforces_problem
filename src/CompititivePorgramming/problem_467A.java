/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

import java.util.*;
public class problem_467A {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int room =sc.nextInt();
    int count=0;
    for(int i=0;i<room;i++){
    int man= sc.nextInt();
    int capacity= sc.nextInt();
    int free= capacity-man;
    if(free>=2){
    count++;
    }
    }
        System.out.println(count);
    }
}
