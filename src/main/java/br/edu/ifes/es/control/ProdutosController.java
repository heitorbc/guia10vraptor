/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.es.control;

import br.com.caelum.vraptor.Controller;
import br.edu.ifes.es.model.Produto;
import br.edu.ifes.es.util.ProdutoDao;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Heitor
 */
@Controller
public class ProdutosController {

    @Inject
    private ProdutoDao dao;

    public void form() {
    }

    public List<Produto> lista() {
        return dao.listaTodos();
    }
}
