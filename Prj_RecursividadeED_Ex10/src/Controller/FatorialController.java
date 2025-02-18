package Controller;

public class FatorialController {
    
    public FatorialController(){
        
        super();        
    }
    
    public int fatorialDuplo(int numero){
        
        if(numero <= 1){
            
            return 1;            
            
        } else {
            
            return numero * fatorialDuplo(numero - 2);
        }
    }
}
