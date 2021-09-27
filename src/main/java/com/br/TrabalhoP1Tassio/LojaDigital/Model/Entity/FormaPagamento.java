package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public enum FormaPagamento {
    DEBITO,
    CREDITO,
    BOLETO,
    PIX;

    private List<Pagamento> pagamentoList;

    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
    }
}
