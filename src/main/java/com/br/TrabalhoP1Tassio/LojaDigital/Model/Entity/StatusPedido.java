package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO,
    SEPARANDO_ESTOQUE,
    ENTREGUE_TRANSPORTADORA,
    ENTREGUE_CLIENTE;

    private List<Pedido> pedidoList;
    private FormaPagamento formaPagamento;

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
