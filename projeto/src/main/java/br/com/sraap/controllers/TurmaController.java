package br.com.sraap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.sraap.models.Turma;
import br.com.sraap.repositories.TurmaRepository;

@Controller
public class TurmaController {

	@Autowired
	private TurmaRepository repository;

	// Metodo que traz o formulario de turmas
	@RequestMapping(value = "privado/nova-turma", method = RequestMethod.GET)
	public String form() {
		return "privado/professor/turmas/formTurma";
	}

	// Metodo que submete os dados para o banco de dados
	@RequestMapping(value = "privado/nova-turma", method = RequestMethod.POST)
	public String save(Turma turma) {
		repository.save(turma);
		return "privado/professor/turmas/formTurma";
	}

	@RequestMapping("privado/turmas")
	public ModelAndView findAll() {
		ModelAndView modelView = new ModelAndView("privado/professor/turmas/listaTurmas");
		Iterable<Turma> turmas = repository.findAll();
		modelView.addObject("turmas", turmas);
		return modelView;
	}
}
