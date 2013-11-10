
package APP.clase3.objeto;

import java.util.Date;

public class Pruebas {

    
    public static void main(String[] args) {
       Date d1=new Date();
       Date d2=d1;
       if(d1==d2){
           System.out.println("son iguales");
       }
       if(d1.equals(d2)){
           System.out.println("son igualess");
       }
    }
}
