package com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity;

import java.util.List;

public class Fornecedora extends Usuario{
    private String cnpj;
    private List<Produto> produtoList;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
