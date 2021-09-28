package com.br.TrabalhoP1Tassio.LojaDigital.Model.Repository;

import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Produto;
import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class UsuarioRepository {
    private JdbcTemplate jdbcTemplate;

    public UsuarioRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Usuario> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        ArrayList<Usuario> buscar = (ArrayList<Usuario>) jdbcTemplate.query(sql, new UsuarioMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Usuario>) jdbcTemplate.query(sql, new Object[]{id}, new UsuarioMapper());
        }
        throw new Exception("Nenhum usuário encontrado com este ID");
    }

    public Usuario adicionar(Usuario usuario) throws Exception {
        String sql = "insert into usuario(id, nome, email, senha) values (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha()
        );

        if(insert == 1) {
            return usuario;
        }

        throw new Exception("Erro ao inserir o usuário");
    }
}
