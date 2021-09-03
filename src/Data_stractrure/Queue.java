/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;
import java.util.*;

public class Queue {
   int head=0;
   int tail=0;
    Scanner sc= new Scanner(System.in);
    int Que_size=sc.nextInt();
    int arrey_size=Que_size+1;
    int []arrey= new int [arrey_size];
    public static void main(String[] args) {
       Queue q = new Queue();
       q.enque(1);
       q.enque(3);
       q.enque(2);
       q.enque(8);
       q.show();
      // q.deque();
    // System.out.print(q.tail);
    }
    void enque(int data){
        if((tail+1)%(arrey_size)==head){
            System.out.println("Queue is full");
        
        }else{
    arrey[tail]=data;
    tail=(tail+1)%(arrey_size);}
    }
    void deque(){int data=0;
        if(head==tail){
System.out.print("Queue is Empty");}
        else{ 
           data=arrey[head];
    head =(head+1)%(Que_size+1);       }
        System.out.println(data);
       
    }  
    void show (){
    for(int j:arrey){
    System.out.println(j+" ");
        //System.out.println(head);
        //System.out.println(tail);
    }
    }
}
