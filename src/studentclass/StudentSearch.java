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
public class StudentSearch {
    
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         Student[] students = new Student[10];
        students[0] = new Student("Cindy", "111");
      students[1] = new Student("June", "222");
       students[2] = new Student("Jen", "333");
        students[3] = new Student("Tom", "444");
         students[4] = new Student("Lucy", "555");
            students[5] = new Student("Edward", "555");
               students[6] = new Student("Anna", "666");
                  students[7] = new Student("Tony", "777");
                     students[8] = new Student("Tiff", "888");
                      students[9] = new Student("Mia", "999");
         System.out.print("PLease enter the student number: ");
String stuNum = scan.nextLine();

String name = "Student not found";

for(Student s: students ){
    if( s.getNumber().equals(stuNum)){
        name = s.getName();
    }
}
System.out.println(name);
    
}
}
    

