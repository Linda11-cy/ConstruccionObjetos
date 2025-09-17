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
    public void listaSuscriptores(){
        System.out.println("Tipo: "+ tipo);
        System.out.println("Costo: "+ costo);
        System.out.println("Periodicidad: "+ periodicidad );

    }


}
