/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;
import java.util.*;

public class problem263A {
    public static void main(String[]args){
 Scanner sc= new Scanner(System.in);
  int row = 5;//sc.nextInt();
  int column = 5;//sc.nextInt();
  int [][]arrey =new int[row][column];
 for (int i =0; i<row;i++){
 for(int j=0;j<column;j++){
 arrey[i] [j]=sc.nextInt();
 }
     
 
  }
 
 if(arrey[0][0] == 1 || arrey[0][4]==1||arrey[4][0]==1 || arrey[4][4]==1){
     System.out.println("4");
     
 }
 else if (arrey[4][1]==1 || arrey[4][3]==1 || arrey[0][1]==1 || arrey[0][3]==1||arrey[1][0]==1 || arrey[1][4]==1||arrey[3][0]==1|| arrey[3][4]==1){
     System.out.println("3");
 }
 else if( arrey[0][2]==1 || arrey[4][2]==1|| arrey[1][1]==1||arrey[1][3]==1||arrey[2][0]==1||arrey[2][4]==1||arrey[3][1]==1||arrey[3][3]==1){
 System.out.println("2");
 }
 else if(arrey [2][2]==1){
 System.out.println("0");}
 else{System.out.println("1");}
  }}
