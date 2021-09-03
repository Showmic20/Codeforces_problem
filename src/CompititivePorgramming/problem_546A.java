/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;

/**
 *
 * @author swarup
 */import java.util.*;
public class problem_546A {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int k= sc.nextInt();
    int n= sc.nextInt();
    int w =sc.nextInt();
    int y=0;
    int z;
    for(int i=1;i<=w;i++){
    int x=k*i;
     y =y+x;
    }
if(y<n){
System.out.print(0);
}
else{
z=y-n;
System.out.print(z);
}
 //
    }
}
