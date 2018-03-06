package EstacionClimatica;
/**
 *  IMPLEMENTACIÓN PARCIAL DE CLASE EstacionClimática
 */
import java.util.Scanner; 
/**
 * 
 * @author SergioyPablo
 *
 */
public class EstacionClimatica 
{ 
    private String nombre; 
    private String fecha;
    private int año; 
    private TempHumDIa mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // Número de mediciones almacenadas 

/**
 * 
 */
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.año = 2000;  
         mediciones = new TempHumDIa[366];  // Por si el año es bisiesto.  
         nummediciones = 0; 
    } 
    /**
     * 
     * @param nombre
     * @param año
     */
    public EstacionClimatica( String nombre, int año) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.año = año; 
         
    } 
/**
 * 
 * @param medida
 * @return true
 */
    public boolean addDia ( TempHumDIa medida){ 
        if (this.año == medida.getAño()){
            mediciones[nummediciones]=medida;
            nummediciones++;
        }
       return true;
    } 
    /**
     * 
     * @param medida
     * @return true
     */
    public boolean delDia ( TempHumDIa medida){ 
        for (int a = 0; a<this.mediciones.length; a++){
            if (this.mediciones[a]!=null){
                if(this.mediciones[a].getDia()==medida.getDia()){
                    this.mediciones[a]=null;
                    nummediciones--;
                    return true;
                }
        }
    }
    return false; 
   } 
    /**
     * 
     */
    public void listarDias(){ 
        for (int a = 0; a<this.mediciones.length; a++){
            if(this.mediciones[a]!=null){
                System.out.println(this.mediciones[a].toString());
            }
        }
    } 
    
    /**
     * Método auxiliar que me indica si una fecha es correcta 
     * @param dia
     * @param mes
     * @param año
     * @return dia> 0 && dia<= 31 && mes > 0 && mes <=12 && año > 1999 && año <=2018;
     */
    static boolean fechaOK ( int dia, int mes, int año){ 
         
       return dia> 0 && dia<= 31 && mes > 0 && mes <=12 && año > 1999 && año <=2018;
    
    } 
    
   /**
    *  
    * @return medicion
    */
     static TempHumDIa leerMedida () { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,año, tempmax, tempmin, hummax, hummin; 
         TempHumDIa  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("Día:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Año:");  año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println ( " Tº Máxima:"); tempmax = leer.nextInt(); 
             System.out.println ( " Tº Mínima:"); tempmin = leer.nextInt(); 
             System.out.println ( " Hº Máxima:"); hummax = leer.nextInt(); 
             System.out.println ( " Hº Mínima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDIa ( dia,mes,año, tempmax, tempmin, hummax, hummin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha érronea"); 
        } 
    
      } while (  error); 
    
        leer.close(); 
        return medicion; 
  }    
}