package EstacionClimatica;
/**
 * Write a description of class TempDia here.
 * 
 */
import java.util.*;
/**
 * 
 * @author SergioyPablo
 *
 */
public class TempDia{
    protected String fecha;
    protected int dia,mes,año,tempmax,tempmin;
    /**
     * Constructor for objects of class TempDia
     */
    public TempDia(int dia, int mes, int año, int tempmax, int tempmin)
    {
       this.dia=dia;
       this.mes=mes;
       this.año=año;
       this.tempmax = 0;
       this.tempmin = 0;
       
    }
    /**
     * 
     * @param media
     * @return devuelve un string que contiene la fecha y la media de la temperatura maxima y minima
     */
    public String toString(int media){
        String fecha = dia+"/"+mes+"/"+año+"/"+tempmin+"/"+tempmax+(media=(tempmax+tempmin)/2);
        return fecha;
    }
    /**
     * 
     * @return año
     */
    public int getAño(){
        return año;
    }
    /**
     * 
     * @return mes
     */
        public int getMes(){
        return mes;
    }
        /**
         * 
         * @return dia
         */
        public int getDia(){
        return dia;
    }
}
