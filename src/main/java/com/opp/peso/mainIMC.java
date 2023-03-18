package com.opp.peso;
import com.opp.peso.persona;
import java.util.Scanner;

public class mainIMC {
    public static void main(String[] args) {
        Scanner scNombre = new Scanner(System.in);
        System.out.println("por favor ingrese su nombre");
        String nombre=scNombre.nextLine();

        Scanner scEdad = new Scanner(System.in);
        System.out.println("por favor ingrese su Edad");
        int edad = scEdad.nextInt();

        Scanner scSexo = new Scanner(System.in);
        System.out.println("por favor ingrese su Sexo 'H' para hombre y 'M' para mujer");
        String sexo=scSexo.nextLine();

        Scanner scPeso = new Scanner(System.in);
        System.out.println("por favor ingrese su peso");
        double peso =scPeso.nextDouble();

        Scanner scAltura = new Scanner(System.in);
        System.out.println("por favor ingrese su Altura");
        double altura = scAltura.nextDouble();


        persona Teclado = new persona(nombre, edad, sexo, peso, altura);
        System.out.println(Teclado);


    }
}
