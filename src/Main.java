import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Clientes
        Cliente cliente01 = new Cliente("Linda", "Alvarado",
                "123 654","Mujer","Alajuela");

        Cliente cliente02 = new Cliente("Alejandro", "Rojas",
                "123 678", "San Jose");

        Cliente cliente03 = new Cliente();

        //cliente01.listaClientes();

        //Suscripciones

        Suscripcion suscriptor01 = new Suscripcion("Basica",5000, 1);
        Suscripcion suscriptor02 = new Suscripcion("Premium", 7500,4 );

        //suscriptor01.listaSuscriptores();

        //Union Cliente-Suscripcion

        cliente01.suscribirse(suscriptor01);
        cliente02.suscribirse(suscriptor02);
        cliente03.suscribirse(new Suscripcion("Familiar",12000,6));

        //Prueba
        Cliente cliente04 = new Cliente("Romario", "Salas",
                "123 654","Hombre","Alajuela");
        Suscripcion suscriptor04 = new Suscripcion("Premium",7500, 3);

        //cliente04.suscribirse(suscriptor04);


    }
}