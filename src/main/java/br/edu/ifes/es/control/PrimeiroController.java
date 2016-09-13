/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.es.control;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author Heitor
 */

@Controller
public class PrimeiroController {

    @Inject private Result result;

    @Get("/home")
    public void home() {
        result.include("mensagem", "Sistema de Controle de Disponibilidade de Recursos Operacionais - SDRO CBMES");
    }
}