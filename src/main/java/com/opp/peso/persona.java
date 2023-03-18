package com.opp.peso;
import java.util.Random;
import java.lang.Integer;
import java.util.random.*;
public class persona {
    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;

    private static final String sexo_d = "H";

    //Constructor para definir


    public persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public persona(String nombre, int edad, int DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //constantes para los resultados de la funcion IMC
    //pesoIdeal entre 20 y 25
    private final static int pesoIdeal=0;
    //debajo si el resultado es <20
    private final static int debajo=-1;
    //debajo si el resultado es >25
    private final static int sobre=1;
    public int calcularIMC(double peso, double altura){
        double imc=(peso/(altura*altura));
        if(imc>=20 && imc<=25){
            return pesoIdeal;
        } else if (imc>25) {
            return sobre;
        }else{
            return debajo;
        }
    }

    public boolean esMayor(int edad){
        boolean mayor=false;
        if(edad>=18){
            return mayor=true;
        }else{
            return mayor;
        }
    }

    public void sexoCorr(String sexo){
        if (sexo!="H" && sexo!="M"){
            this.sexo=sexo_d;
        }
    }

    @Override
    public String toString() {
        return "persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", DNI=" + DNI +
                ", sexo='" + sexo + '\'' + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void generarID(){
        //divosor porque en españa asi se usa, numero de 8 digitos y se divide en 23
        final int divisor =23;
        //con java utils usamos la funcion random
        Random numeroRandom = new Random();
        //se define el limite del numero, como es de 8 digitos, va de 0 a 89.999.999
        //como es un numero aleatorio entre 0 y 89.999.999, se le suma 10.000.000 para que seguro tenga 8 cifas
        int numDNI = numeroRandom.nextInt(90000000)+10000000;
        //se necesita el modulo asi que es % para generar la letra
        int residuoDNI = numDNI % divisor;
        //se busca la letra en el residuo
        char letraDNI = "qwertyuiopasdfghjklzxcvbnm".charAt(residuoDNI);
        //creamos el DNI como string, convertimos el numero a cadena
        String DNI = Integer.toString(numDNI) + letraDNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
