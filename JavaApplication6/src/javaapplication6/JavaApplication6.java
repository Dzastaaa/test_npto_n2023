/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author student
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Poczatek programu");
        
        final int N = 10;
        int tab[] = new int[N];
        
        for(int i = 0; i < N; i++)
            tab[i] = 0;
        
        int min = tab[0];
        for(int i = 0; i < N; i++)
            if(tab[i]<min)
                min = tab[i];
        
        System.out.println("min="+min);
        
        int max = tab[0];
        for(int i = 1; i < N; i++)
            if(tab[i]>max)
                max = tab[i];
        
        System.out.println("max="+max);
        
        System.out.println("Koniec programu");
    }
    
}
