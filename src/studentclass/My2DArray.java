/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentclass;
import java.util.Scanner;
/**
 *
 * @author lenhu
 */
public class My2DArray {
    
    public static void main(String[] args){
  Scanner scan = new Scanner( System.in);
  int[][] values = new int[2][3];
  
  for( int i =0; i<2; i++){
   for( int j = 0; j<3; j++){   
       System.out.print("Enter the number : "  );
       values[i][j]=scan.nextInt();
  }
}
print2DArray(values);
}
public static void print2DArray(int[][] arr){
   for( int i =0; i<arr.length; i++){
   for( int j = 0; j<arr[i].length; j++){  
      System.out.print(arr[i][j] + " ");
}
   System.out.println();
   }}
}