/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavprog;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Tugasjavprog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Angka = new Scanner (System.in);
        int a;
        int b;
        int c;
    System.out.print("Number 1 = ");
    a = Angka.nextInt();
    System.out.print("Number 2 = ");
    b = Angka.nextInt();
    System.out.print("Number 3 = ");
    c = Angka.nextInt();
    System.out.println("Rata-rata = " + ((a+b+c)/3));
    }
    
    public static void Tugas2 (){
        
         String number1 = JOptionPane.showInputDialog("Number 1 = ");
         String number2 = JOptionPane.showInputDialog("Number 2 = ");
         String number3 = JOptionPane.showInputDialog("Number 3 = ");
   
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int n3 = Integer.parseInt(number3);
                
                int rata = (n1+n2+n3)/3;
                String msg = "Number 1 = " +n1+ "\n Number 2 = " +n2+ "\n Number 3 = " +n3+ "\n\n Rata-Rata = "+rata;
            JOptionPane.showMessageDialog(null, msg);
    }
    
}
