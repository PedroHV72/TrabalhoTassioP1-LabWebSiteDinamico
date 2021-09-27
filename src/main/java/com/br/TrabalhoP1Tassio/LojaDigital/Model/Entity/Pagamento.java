package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public class Pagamento {
    private Integer id;
    private List<Pedido> pedidoList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }
}
