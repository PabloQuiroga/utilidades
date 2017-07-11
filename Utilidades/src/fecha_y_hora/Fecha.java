package fecha_y_hora;

import java.util.Calendar;

/**
 * Obtener fecha desde el sistema
 *
 * @author Pablo Daniel Quiroga
 */
public class Fecha {
    //Constantes

    private final String DIA_SEMANA[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
    private final String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    //variables
    private Calendar fecha;
    private String dia_semana;
    private String mes;
    private int dia_numerico;
    private int mes_numerico;
    private int anio;

    public Fecha() {
        fecha = Calendar.getInstance();
        this.dia_semana = setDia_semana(fecha.get(Calendar.DAY_OF_WEEK));
        this.mes_numerico = fecha.get(Calendar.MONTH) + 1;
        this.mes = setMes(mes_numerico);
        this.dia_numerico = fecha.get(Calendar.DATE);
        this.anio = fecha.get(Calendar.YEAR);
    }

    /**
     * SETTERS
     */
    private String setMes(int x) {
        String retorno = MESES[x];
        return retorno;
    }

    private String setDia_semana(int x) {
        String retorno = DIA_SEMANA[x - 1];
        return retorno;
    }

    /**
     * GETTERS
     */
    public String getDia_semana() {
        return dia_semana;
    }

    public String getMes() {
        return mes;
    }

    public int getDia_numerico() {
        return dia_numerico;
    }

    public int getMes_numerico() {
        return mes_numerico;
    }

    public int getAnio() {
        return anio;
    }

    /**
     * OTROS
     * @return
     */
    @Override
    public String toString() {
        return getDia_semana() + " " + getDia_numerico() + " de " + getMes() + " de " + getAnio();
    }

    //TEST
    /*public static void main(String[] args) {
		Fecha fecha = new Fecha();
		System.out.println(fecha.toString());
	}*/
}
