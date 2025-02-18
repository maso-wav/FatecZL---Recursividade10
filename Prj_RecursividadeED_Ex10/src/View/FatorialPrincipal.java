package View;

import Controller.FatorialController;

public class FatorialPrincipal {
    
    public static void main (String args[]){
        
        FatorialController fc = new FatorialController();
        
        int numero = 2;
        int fat = fc.fatorialDuplo(numero);
        
        System.out.println("O FATORIAL DUPLO DE " + numero + " É: " + fat + ".");
    }
    
}
