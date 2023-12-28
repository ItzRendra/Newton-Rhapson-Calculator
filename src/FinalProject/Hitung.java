/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;
import java.lang.Math;

/**
 *
 * @author ASUS
 */
public class Hitung implements Rumus{

    @Override
    public void Newton(double input) {
//        System.out.println("method newton di hitung");
        int i = 1;
        double a,b,c;
        
        a =  Math.pow(input, 3) - 2*Math.pow(input, 2) + input - 3;
        b = 3*Math.pow(input, 2) - 4*input + 1;
        c = input;
        
        input = c - a/b;
        
        HomeFrame.h1 = Double.toString(a);
        HomeFrame.h2 = Double.toString(b);
        HomeFrame.h3 = Double.toString(input);
        HomeFrame.i = Integer.toString(i);
        
        
    }
    
}
