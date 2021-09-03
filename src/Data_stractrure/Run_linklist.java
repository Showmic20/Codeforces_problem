/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

public class Run_linklist {
public static void main(String[]args){
Linkedlist l = new Linkedlist();
        l.insert(90);
        l.insert(33);
        l.insert(34);
        l.insertfirst(22);
        l.insertat(0, 77);
      l.deleteAt(1);
        l.show();
}   
}
