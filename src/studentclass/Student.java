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
class Student {
    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
    
    

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }   
}