package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public class Cliente extends Usuario{
    private String cpf;
    private List<Pedido> pedidoList;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }
}
