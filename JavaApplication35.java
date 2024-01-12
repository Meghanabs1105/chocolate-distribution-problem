//chocolate distribution problem

package javaapplication35;
import java.util.*;
import java.io.*;


public class JavaApplication35 {
  
    public static int find(int [] arr,int m,int n){
        int ans=Integer.MAX_VALUE;
        //m=no of students
        //n=available no of packets
        Arrays.sort(arr);
        for(int i=0;i<=n-m;i++)
        {
           int min=arr[i];
          int max=arr[i+m-1];
         int difference=max-min;
         if(ans>difference){
             ans=difference;
         }
         
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        System.out.println("enter the total number of chocolate packets available ");
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] arr=new int[n];
       System.out.println("enter the no of students");
       int m=in.nextInt();
       System.out.println("enter the number of chocolates available in each packets");
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
           
       }
      int ans= find(arr,m,n);
       System.out.println(ans);
    }
    
}
