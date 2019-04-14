package br.com.sraap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.sraap.models.Atividade;
import br.com.sraap.repositories.AtividadeRepository;

@Controller
public class AtividadeController {

	@Autowired
	private AtividadeRepository repository;

	// Metodo que traz o formulario de atividades
	@RequestMapping(value = "/nova-atividade", method = RequestMethod.GET)
	public String form() {
		return "works/formAtividade";
	}

	// Metodo que submete os dados para o banco de dados
	@RequestMapping(value = "/nova-atividade", method = RequestMethod.POST)
	public String save(Atividade atividade) {
		repository.save(atividade);
		return "works/formAtividade";
	}

	@RequestMapping("/atividades")
	public ModelAndView findAll() {
		ModelAndView modelView = new ModelAndView("/works/listaAtividades");
		Iterable<Atividade> atividades = repository.findAll();
		modelView.addObject("atividades", atividades);
		return modelView;

	}
}
