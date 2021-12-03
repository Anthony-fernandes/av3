package br.edu.fafic;

public class Pagamento {

    public double efetuarPagamento(){
        if (isEmAberto()){
            return pagamentoEmAberto();
        }
        if(isPreparado()){
            return pagamentoPreparado();
        }
        if(isAtrasado()){
            return pagamentoAtrasado();
        }
        return pagamentoNormal();
    }
}
