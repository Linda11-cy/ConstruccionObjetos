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
    public void listaClientes(){
        System.out.println("Nombre: "+ nombreCliente);
        System.out.println("Apellido: "+ apellidoCliente);
        System.out.println("Cedula: "+ cedulaCliente);
        System.out.println("Sexo: "+ sexoCliente);
        System.out.println("Ubicacion: "+ ubicacionCliente);
    }
    public void suscribirse(Suscripcion suscripcion){
        System.out.println(nombreCliente+ " " + apellidoCliente + " adquirió una suscripción "+ suscripcion.tipo);
        System.out.println("________________________");

    }
}