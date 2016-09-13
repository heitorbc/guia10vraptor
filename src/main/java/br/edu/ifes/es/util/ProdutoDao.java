/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.es.util;

import br.edu.ifes.es.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Heitor
 */
@RequestScoped
public class ProdutoDao {

    public List<Produto> listaTodos() {
        return new ArrayList<Produto>();
    }
}
