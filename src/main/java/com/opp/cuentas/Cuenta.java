package com.opp.opp;

public class Cuenta {

    //Atributos
    private String titular;
    private double cantidad;

    //Constructores obligatorio para el caso de titular
    public Cuenta(String titular){
        this(titular,0);//Sobrecarga para hacerlo obligaotio e inicia en 0
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //toString para encapsular y mostrar el mensaje que deseamos sin errores
    @Override
    public String toString() {
        return "Cuenta{" + "titular='" + titular + '\'' + ", cantidad=" + cantidad + '}';
    }

    public Cuenta(String titular, double cantidad) {
       //Se inicia titular
        this.titular=titular;
        //Cantidad ya tiene su condicion de uso, desde aqui se puede aplicar
        if(cantidad<0){
            this.cantidad=0;
        } else if (cantidad>0) {
            this.cantidad=cantidad;
        }
    }

    //Los metodos de la clase (lo que haremos con los atributos)
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }
    }

    //El metodo de retirar
    public void retirar(double cantidad){
        if(this.cantidad-cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad-=cantidad;
        }
    }

    }

