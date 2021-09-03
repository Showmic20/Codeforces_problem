/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompititivePorgramming;
import java.util.*;
public class porblem_339A {
  public static void main(String[]args){
Scanner sc= new Scanner(System.in);
String a=sc.next();
int count1=0;
int count2=0;
int count3=0;
String s= "";
        
//int[]arrey={i};
//Arrays.sort(arrey);
for (int i=0;i<a.length();i++){
    if (a.charAt(i)=='1'){
    count1++;
    }
    else if(a.charAt(i)=='2'){
    count2++;
    }
    else if(a.charAt(i)=='3'){
    count3++;
    }

}
for(int j=0;j<count1;j++){
s=s+"1+";
}
for(int j=0;j<count2;j++){
s=s+"2+";
}
for(int j=0;j<count3;j++){
s=s+"3+";
}
s=s.substring(0 , a.length());
System.out.print(s);
  //System.out.println(Arrays.toString(arrey));
  
  }

}
