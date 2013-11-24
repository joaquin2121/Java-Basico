package APP.clase5.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploString {
   
    
    private List<String> lineas;
    private String fileine;
    
    public EjemploString(String file) {
        this.lineas = new ArrayList<String>();
        this.fileine = file;
    }
    
    public void actualizardatos() {
        leer();
        guardar();
        
    }

    public void guardar() {
        
        
        try {
            FileWriter fw = new FileWriter(this.fileine);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (String line : this.lineas) {
                bw.write(line);
                bw.newLine();
                
            }
            bw.write("nuevo msn");
            bw.newLine();
            bw.write("somos del programa integral tecsup");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void leer() {
        String sInput = null;
        try {
            FileReader fr = new FileReader(this.fileine);
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                this.lineas.add(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
