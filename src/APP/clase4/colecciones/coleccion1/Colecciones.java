package APP.clase4.colecciones.coleccion1;
/* http://vis.usal.es/rodrigo/documentos/aso/JavaHilos.pdf*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        Colecciones.ejemploEstudiante();
        // Colecciones.ejemploLinkedList();
        //Colecciones.ejemploSet();
        Colecciones.ejemploMap();
    }

    public static void ejemploMap() {
        Estudiante gomez = new Estudiante("Alberto", "Zapata");
        Estudiante jorge = new Estudiante("Benjamin", "Ayasta");
        Estudiante jose = new Estudiante("Carlos", "Lopez");
        Estudiante rafa = new Estudiante("Carlos", "Lopez");

// HashMap
        HashMap<Integer, Estudiante> listado = new HashMap<Integer, Estudiante>();
        listado.put(123, gomez);
        listado.put(1234, jorge);
        listado.put(12345, jose);
        listado.put(123456, rafa);

        listado.get(123).printEstudiante();// para acceder al metodo del objeto con el id.

        Collection<Estudiante> listadoMap = listado.values();// para listar


        for (Estudiante estudiante : listadoMap) {
            estudiante.printEstudiante();// accediendo al metodo printEstudiante();
        }
    }

    public static void ejemploSet() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata Zapata");
        Estudiante e2 = new Estudiante("Penjamin", "Ayasta Alaya");
        Estudiante e3 = new Estudiante("Carlos", "Lopez Lopez");

        Set<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        listado.add(e3);
        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
    }

    public static void ejemploLinkedList() {
        Estudiante jose = new Estudiante("Alberto", "Zapata Zapata");
        Estudiante gomes = new Estudiante("Penjamin", "Ayasta Alaya");
        Estudiante jorge = new Estudiante("Carlos", "Lopez Lopez");

        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(jose);
        listado.add(gomes);
        listado.add(jorge);
        listado.add(jorge);
        Collections.sort(listado);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }
        System.out.println(listado.size());

    }

    public static void ejemploEstudiante() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata Zapata");
        Estudiante e2 = new Estudiante("Penjamin", "Ayasta Alaya");
        Estudiante e3 = new Estudiante("Carlos", "Lopez Lopez");

        // ArrayList

        // List<Estudiante> listado = ArrayList<Estudiante>();

        ArrayList<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();

        }
        System.out.println(listado.size());
        e1 = listado.get(1);
        e1.printEstudiante();
    }
}
