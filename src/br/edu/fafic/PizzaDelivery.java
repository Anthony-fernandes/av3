package br.edu.fafic;

public class PizzaDelivery {

    private int numeroDeEntregadores = 1;
    private int numerodeDeEntregasAtrasadas;
    private int numerodeMaximoDeEntregas = 5;

    public boolean maisDeCincoEntregasAtrasadas(){
        return numerodeDeEntregasAtrasadas > numerodeMaximoDeEntregas;
    }

    public int quantidadeDeEntregadores(){
        if (maisDeCincoEntregasAtrasadas()){
            return numeroDeEntregadores + 1 ;
        }else {
            return numeroDeEntregadores;
        }

    }


}
