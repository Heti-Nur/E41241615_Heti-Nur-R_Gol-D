/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sibdd;

/**
 *
 * @author Heti
 */
import java.util.Scanner;

public class SIBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
        int Jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + Jumlah);
    }
    
}
