package projeto.date;

import java.util.Date;


public class TiposDates {
    public static void main(String[] args) {
        
        
       
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Milissegundos : "+currentTimeMillis);
        
        Date  novaData = new Date();
        System.out.println("data atual: "+ novaData);
        
        
    }
    
}
