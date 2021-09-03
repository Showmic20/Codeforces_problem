
package CompititivePorgramming;

import java.util.*;
public class Problem_677A {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int hight=sc.nextInt(); 
    int count=0;
   
    for(int i=0;i<n;i++){
    int nof= sc.nextInt();
    if(nof>hight){
    count=count+2;
    }
    else{
    count++;
    }
    }
        System.out.println(count);
}}
