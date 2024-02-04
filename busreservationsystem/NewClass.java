/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busreservationsystem;
import java.util.*;
import java.lang.*;
/**
 *
 * @author ASUS
 */
public class NewClass {
    NewClass(){
    System.out.println("2\n\n");
    int i,j,k,count=0,no,x,high,shigh,size;
    for(i=0;i<6;i++){
    for(j=0;j<6;j++){
    if(i==0 || i==5 || j==0 || j==5){
    System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
    }
    System.out.println();
    }
    
    System.out.println("\n\n3\n\n");
    for(i=5;i>=0;i--){
    for(k=0;k<(5-i);k++){
        System.out.print(" ");
    }
    for(j=0;j<=i;j++){
        if(i%2==1){
            System.out.print(" *");
        }
        else{
        System.out.print(" *");
        }
    }
    System.out.println();
    }
    
    System.out.println("\n\n4\n\n");
    no=2;
     
        for(i=2;count<=50;i++){
            x=0;
        for(j=2;j<i;j++){
        if(i%j==0){
        x=1;
        }
        }
        if(x==0){
           System.out.println(i); 
        count++;
        }
        }
        
    System.out.println("\n\n5\n\n");
    
    Scanner sc=new Scanner(System.in);
    String str;
    str=sc.nextLine();
    size=str.length();
    char[] ca = str.toCharArray();
    for(i=0;i<size;i++){
        if(ca[i]>97){
         x = ca[i]-32;
        }
        else{
            x = ca[i]+32;
        }
         char c=(char) x;
        System.out.print(c);
    }
    /*str.charAt(i);*/
    

    System.out.println("\n\n6\n\n");
    high=-1000;
    shigh=-1000;
    int[] arr = new int[100];
    System.out.println("Entetr size");
    size=sc.nextInt();
    System.out.println("Enter Elements");
    for(i=0;i<size;i++){
    arr[i]=sc.nextInt();
    }
    for(i=0;i<size;i++){
    if(arr[i]>high){
    shigh=high;
    high=arr[i];
    }
    else if(arr[i]>shigh && arr[i]<high){
    shigh=arr[i];
    }
    }
    System.out.println(shigh);
    }
    public static void main(String args[]){
    NewClass ne = new NewClass();
    }
    
}
