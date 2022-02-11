/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentclass;

/**
 *
 * @author lenhu
 */
public class PrintArray {
    
    public static void main(String[] args){
        int[] values = {7,2,3,4,5,6,1,8,9};
     //for( int element : values){
        // System.out.print(element + " ");
      printArray(values);   
         
      swap(values,0,6);
         
}
    
    public static void print(){
     System.out.println("THis is the cahnge in the local repo");   
    }
     public static void printArray(int[] values){
   for( int ele: values){      
       System.out.print(ele + " ");
   }
     }
     public static void swap(int[] values, int i, int j ){
         int[] arr = new int[values.length];
         int temp = values[i];
         arr[j]=values[j];
         values[i]=temp;
         System.out.print(values[j]);
}

public static void printOupt(){
    System.out.println("Print the different between 2 output");

}}