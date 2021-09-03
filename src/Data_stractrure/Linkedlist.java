/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

public class Linkedlist {

    Node head;

    public void insertfirst(int data) {
        Node fstnode = new Node();
        fstnode.data = data;
        fstnode.next = head;
        head = fstnode;
    }

    public void insertat(int index, int data) {
        Node nodeat = new Node();
        nodeat.data = data;
        nodeat.next = null;
        Node n = head;
        if (index == 0) {
            insertfirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            nodeat.next = n.next;
            n.next = nodeat;
        }
    }

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        // System.out.print("hi");
        Node nd = head;
        while (nd.next != null) {
            System.out.println(nd.data);
            nd = nd.next;
        }
        System.out.println(nd.data);
    }

    public void deleteAt(int index) {
        
        if (index == 0) {
            Node n2=head;
            head = head.next;
           System.out.println("Deleted 1st Data "+n2.data);
        } 
        else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Delete" + n1.data);
        }
    }
}
