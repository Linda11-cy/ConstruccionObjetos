public class Cliente {
    String nombreCliente;
    String apellidoCliente;
    String cedulaCliente;
    String sexoCliente;
    String ubicacionCliente;


    Cliente(String nombreClienteObjeto,
            String apellidoClienteObjeto,
            String cedulaClienteObjeto,
            String sexoClienteObjeto,
            String ubicacionClienteObjeto){
        nombreCliente = nombreClienteObjeto;
        apellidoCliente = apellidoClienteObjeto;
        cedulaCliente = cedulaClienteObjeto;
        sexoCliente =  sexoClienteObjeto;
        ubicacionCliente = ubicacionClienteObjeto;

    }
    Cliente(String nombreClienteObjeto,
            String apellidoClienteObjeto,
            String cedulaClienteObjeto,
            String ubicacionClienteObjeto){
        nombreCliente = nombreClienteObjeto;
        apellidoCliente = apellidoClienteObjeto;
        cedulaCliente = cedulaClienteObjeto;
        ubicacionCliente = ubicacionClienteObjeto;
    }
      Cliente(){
          nombreCliente = "Cliente anónimo";
          apellidoCliente = "";

    }

    public void suscribirse(Suscripcion suscripcion){
        System.out.println(nombreCliente+ " " + apellidoCliente + " adquirió una suscripción "+ suscripcion.tipo);
        System.out.println("________________________");

    }
    //Getters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public String getUbicacionCliente() {
        return ubicacionCliente;
    }
    //Setters

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public void setUbicacionCliente(String ubicacionCliente) {
        this.ubicacionCliente = ubicacionCliente;
    }
    //equals
    public boolean equals(Cliente clienteComparar){
        return nombreCliente.equals(clienteComparar.nombreCliente) &&
                apellidoCliente.equals(clienteComparar.apellidoCliente) &&
                cedulaCliente.equals(clienteComparar.cedulaCliente) &&
                sexoCliente.equals(clienteComparar.sexoCliente) &&
                ubicacionCliente.equals(clienteComparar.ubicacionCliente);
    }
    //toString
    public String toString(){
        return "Nombre: " + nombreCliente +"\nApellido: " + apellidoCliente + "\nCedula: " + cedulaCliente +
                "\nSexo: " + sexoCliente + "\nUbicacion: " + ubicacionCliente + "\n";
    }
}