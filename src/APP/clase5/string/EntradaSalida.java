package APP.clase5.string;

import java.io.File;

public class EntradaSalida {

    public void CreateDirectorio() {
         File dir = new File("C:\\javaTecsup");
         if(!dir.isDirectory()&&!dir.exists()){
         dir.mkdir();
         
         }
    }
    
    
    public void listarDirectorio() {
        File f = new File("C:\\");
        if ((f.exists()) && (f.isDirectory())) {
            for (String subDir : f.list()) {
                System.out.println(subDir);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public void verificarArchivo() {
        File f = new File("C:\\temario.txt");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());

        if (f.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
