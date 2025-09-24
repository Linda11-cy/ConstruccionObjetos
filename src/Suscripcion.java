public class Suscripcion {

    String tipo;
    int costo;
    int periodicidad;

    Suscripcion(String tipoObjeto,
                int costoObjeto,
                int periodicidadObjeto) {
        tipo = tipoObjeto;
        costo = costoObjeto;
        periodicidad = periodicidadObjeto;
    }
    //Getters
    public String getTipo() {
        return tipo;
    }

    public int getCosto() {
        return costo;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    //equals
    public boolean equals(Suscripcion suscripcionComparar){
        return tipo.equals(suscripcionComparar.tipo) &&
                costo == suscripcionComparar.costo &&
                periodicidad == suscripcionComparar.periodicidad ;
    }
    //toString
    public String toString(){
        return "Tipo: " + tipo + "\nCosto: " + costo + "\nTotal Meses: " + periodicidad + "\n";
    }

}
