package APP.clase5.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {

        LecturaEscritura.EscribirArchivo();
        LecturaEscritura.leerArchivo();

    }

  
    
    private static void leerArchivo() {

        String sInput = null;
        try {
            FileReader fr = new FileReader("c:\\javaTecsup\\ejemplo.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void EscribirArchivo() {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("c:\\javaTecsup\\ejemplo.txt");
            bw = new BufferedWriter(fw);
            bw.write("buenas noches tecsup");
            bw.newLine();
            bw.write("somos del programa integral");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
