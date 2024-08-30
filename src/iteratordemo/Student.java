/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratordemo;

/**
 *
 * @author lkfritz
 */
public class Student {
    private String name;
    private String id;
    
    public Student(String n, String id){
        name = n;
        this.id = id;
    }
    
    public Student(){this("","");}

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
