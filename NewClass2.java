
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sksba
 */
public class NewClass2 {
    
}
 public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter value of n:");
       int sum=0;
       int n=obj.nextInt();
       System.out.println("Enter numbers to be added:");
       for(int i=0;i<n;i++)
       {
           //sum+=obj.nextInt();
           int num=obj.nextInt();
           sum=sum+num;
       }
       System.out.println("Sum of  "+n+" numbers is: "+sum);
    }
    
}
