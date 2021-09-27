package com.br.TrabalhoP1Tassio.LojaDigital.Model.Repository;

import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {
    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("fotoUrl"));
        produto.setDataCadastro(resultSet.getDate("dataCadastro").toLocalDate());
        produto.setValorUnitario(resultSet.getFloat("valorUnitario"));

        return produto;
    }
}
