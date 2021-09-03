/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_stractrure;

public class Linerar_search {
    public static void main(String[]args){
    int arrey[]={12,23,22,33,43,66};
    int x=50;
     System.out.println(x+"found"+search(arrey,x));  
    }
    public static int search(int arrey[],int x){
        int i;
        for( i=0;i<arrey.length-1;i++){
            if(arrey[i]==x){
            return i;
            }
        
        }
    return -1;
    }
}
