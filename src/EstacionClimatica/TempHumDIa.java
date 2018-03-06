package EstacionClimatica;
/**
 * 
 * @author SergioyPablo
 *
 */
public class TempHumDIa extends TempDia{
     protected int hum_max, hum_min;
     /**
      * 
      * @param hum_max
      * @param hum_min
      * @param dia
      * @param mes
      * @param año
      * @param tempmax
      * @param tempmin
      */
     public TempHumDIa(int hum_max, int hum_min, int dia, int mes, int año, int tempmax, int tempmin){
       super(dia,mes,año,tempmax,tempmin);
       this.hum_max=hum_max;
       this.hum_min=hum_min;
    }
    /**
     * 
     */
    public String toString(int mediaHum)
    {
       String humedad= hum_max+"-"+hum_min+"-"+(mediaHum=(hum_max+hum_min)/2);
       return humedad;
    }
}
