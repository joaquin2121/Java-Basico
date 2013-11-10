package APP.clase3.interfaces.capital;

public class Palabra  implements Capitalizable{
 String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }
 
    @Override
    public String cambiaMayuscula() {
       return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase(); 
    }
    
}
