package br.edu.fafic;

public class Lista {
    private int objetos = 10;
    private Object[] elementos = new Object[objetos];
    private int tamanho = 0;
    private boolean somenteLeitura;


    public boolean validador(){
        return tamanho + 1 > elementos.length && !somenteLeitura;
    }

    public void add(Object elemento){
        if (validador()){
            Object[] newElementos = new Object[elementos.length + objetos];
            for (int i = 0; i < tamanho; i++){
                newElementos[i] = elementos[i];
                elementos = newElementos;
            }
            elementos[tamanho++] = elemento;
        }
    }

}
