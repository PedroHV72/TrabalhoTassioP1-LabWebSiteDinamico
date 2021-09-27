package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Integer id;
    private Float valorTotal;
    private LocalDate dataPedido;
    private StatusPedido statusPedido;
    private List<ProdutoPedido> produtoPedidoList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<ProdutoPedido> getProdutoPedidoList() {
        return produtoPedidoList;
    }

    public void setProdutoPedidoList(List<ProdutoPedido> produtoPedidoList) {
        this.produtoPedidoList = produtoPedidoList;
    }
}
