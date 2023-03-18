package com.opp.cuentas;
import com.opp.cuentas.Cuenta;
public class main {
    public static void main(String[] args) {
        //Creamos los objetos
        Cuenta usuario1 = new Cuenta("Jose Martinez",300);
        Cuenta usuario2 = new Cuenta("Federico Diaz", 4000);
        Cuenta usuario3 = new Cuenta("Carlos Mora");

        //Utilizando los metodos
        usuario1.ingresar(300);
        usuario2.retirar(300);
        usuario3.ingresar(4000);

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);

    }
}
