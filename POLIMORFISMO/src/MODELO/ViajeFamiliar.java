package MODELO;

import java.util.Date;

/**
 * Viaje en familia
 *
 * @author Libardo Pantoja, Ricardo Zambrano
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {

        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    @Override
    public String cualquierMetodo2() {
        return "M�todo implementado en la clase hija viaje familiar";
    }
}
