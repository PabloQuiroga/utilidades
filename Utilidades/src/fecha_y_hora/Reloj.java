package fecha_y_hora;

import java.util.Calendar;

/**
 * Obtener instantanea de horario en sistema
 *
 * @author Pablo Daniel Quiroga
 */
public class Reloj {

    private Calendar reloj;
    private int hora;
    private int minutos;

    public Reloj() {
        reloj = Calendar.getInstance();
        hora = reloj.get(Calendar.HOUR_OF_DAY);
        minutos = reloj.get(Calendar.MINUTE);
    }

    //GETTERS
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minutos;
    }

    //OTROS
    @Override
    public String toString() {
        return getHora() + ":" + getMinuto();
    }

    //TEST
    /*public static void main(String[] args) {
		Reloj horario = new Reloj();
		System.out.println(horario.toString());
	}*/
}
