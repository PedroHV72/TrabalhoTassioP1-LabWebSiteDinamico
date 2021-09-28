package com.br.TrabalhoP1Tassio.LojaDigital.Controller;

import com.br.TrabalhoP1Tassio.LojaDigital.Model.Entity.Produto;
import com.br.TrabalhoP1Tassio.LojaDigital.Model.Repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Produto> buscarPorId(@PathVariable Integer id) throws Exception {
        return produtoRepository.buscarPorId(id);
    }
}
