package APP.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Formato {
    private static Object now;

    public static void main(String[] args) {
      
        Formato.numberFormat();
        Formato.monedaFormat();
        Formato.gregorianCalendar();
      //  Formato.dateFormat();
        Formato.simpledateformat();
        Formato.compararfechas();
    }
     public static void compararfechas() {
Calendar fecha1 = new GregorianCalendar(2011,9,1);
Date f1 = fecha1.getTime();
Calendar fecha2 = new GregorianCalendar(2011,9,3);
Date f2 = fecha2.getTime();
if (f1.after(f2)) {
System.out.println("d1 es después que d2");
}
if (f1.before(f2)) {
System.out.println("d1 es antes que d2");
}
    }
    
    
    
    public static void simpledateformat() {

     DateFormat df = new SimpleDateFormat("E d MMMM hh:mm a");
    Date now = new Date();
        System.out.println(""+df.format(now));
    }
    /*
     public static void dateFormat() {
     DateFormat df = DateFormat.getDateInstance();
DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,Locale.US);
//SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
    String s = df.format(now);
String s1 = df1.format(now);
String s2 = df2.format(now);
String s3 = df3.format(now);
String s4 = df4.format(now);
String s5 = df5.format(now);
System.out.println("(Default) Hoy es " + s);
System.out.println("(SHORT) Hoy es " + s1);
System.out.println("(MEDIUM) Hoy es " + s2);
System.out.println("(LONG) Hoy es " + s3);
System.out.println("(FULL) Hoy es " + s4);
System.out.println("(CUSTOM) Hoy es " + s5);
     
     } 
    
*/
    public static void gregorianCalendar() {
      GregorianCalendar ahora = new GregorianCalendar();
 //Crear una fecha
 //ahora = new GregorianCalendar(1988,5,2);
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
//
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
//
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));


    }

    public static void monedaFormat() {
        // Formato de moneda
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false);

        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(false);
        Locale formatoSpañolPeruano = new Locale("es", "PE");
        NumberFormat nfp = NumberFormat.getCurrencyInstance(formatoSpañolPeruano);
        nfp.setGroupingUsed(false);
        System.out.println("Moneda Euro :" + formatoAleman.format(1501522));
        System.out.println("Moneda Dolar :" + formatoAmericano.format(1525520));
        System.out.println("Moneda Soles :" + nfp.format(1552520));
    }

    public static void numberFormat() {
        // Establecer el Locale como US para usar el punto como
// separador decimal.
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
// Agrupar nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
// No agrupar
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));
        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));
        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));
        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));
        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
    }
}
