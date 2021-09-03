/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

import java.util.*;

public class STK {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrey = new int[n];
    int top = 0;

    public static void main(String[] args) {
        STK p = new STK();
        p.push(3);
        p.push(5);
        p.push(9); p.push(6);p.push(2);
        p.push(1); p.push(12);
//p.pop();
        //System.out.println(p.pop());
        //System.out.println(p.pop());
        //System.out.println(p.pop());
        //System.out.println(p.pop());
        //System.out.println(p.pop());
        
        //System.out.print(top);
       p.show();
    }

    public void push(int data) {
        if(top<n){
        arrey[top] = data;
        top++;}
        else{
            System.out.println("stack is full ");}
    }

    public void show() {
        for (int j: arrey) {
            System.out.print(j + " ");

        }
    }

    public int pop() {
        if(top==0){
        System.out.print("stack is empty");
        }else{
        top--;
        int data = arrey[top];
        arrey[top] = 0;
      return data;}return 1;
    }

}
