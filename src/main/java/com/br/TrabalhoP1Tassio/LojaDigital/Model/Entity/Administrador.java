package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public class Administrador extends Usuario{
    private Integer codigoAdministrador;
    private List<StatusPedido> statusPedidoList;

    public Integer getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public void setCodigoAdministrador(Integer codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public List<StatusPedido> getStatusPedidoList() {
        return statusPedidoList;
    }

    public void setStatusPedidoList(List<StatusPedido> statusPedidoList) {
        this.statusPedidoList = statusPedidoList;
    }
}
