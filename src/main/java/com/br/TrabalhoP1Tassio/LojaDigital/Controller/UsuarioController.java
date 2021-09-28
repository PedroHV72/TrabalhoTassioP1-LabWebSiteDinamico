package com.br.TrabalhoP1Tassio.LojaDigital.Controller;

import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Produto;
import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Usuario;
import com.br.TrabalhoP1Tassio.LojaDigital.Model.Repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(JdbcTemplate jdbcTemplate) {
        usuarioRepository = new UsuarioRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario inserir(@RequestBody Usuario usuario) throws Exception {
        return usuarioRepository.adicionar(usuario);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Usuario> buscarPorId(@PathVariable Integer id) throws Exception {
        return usuarioRepository.buscarPorId(id);
    }
}
