/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratordemo;

/**
 *
 * @author lkfritz
 */
public class Rectangle {
    private double width, length;
    
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public Rectangle(){
        this(0.0, 0.0);
    }

    @Override
    public String toString() {
        return "width=" + width + ", length=" + length;
    }
    
    
    
    
}
