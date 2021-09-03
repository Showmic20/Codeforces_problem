;
package CompititivePorgramming;

/**
 *
 * @author swarup
 */
import java.util.*;
public class problem977A {
  public static void main(String []args){
  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
  int k= sc.nextInt();
  int lastdigite=0;
  
  for ( int i=0;i<k;i++){
      lastdigite=n%10;
  if(lastdigite!=0){
  n--;
  }
  else if(lastdigite==0){
  n= n/10;
  }
  }
  System.out.println(n);
  }  
}
