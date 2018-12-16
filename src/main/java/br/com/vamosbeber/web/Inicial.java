package br.com.vamosbeber.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.vamosbeber.model.dao.ForumLancesDao;

@Controller
public class Inicial {

	@Autowired
	private ForumLancesDao forumLancesDao;
	
	@RequestMapping("/")
	public ModelAndView inicio() {
		ModelAndView model = new ModelAndView("inicio");
		
		model.addObject("forumLances", forumLancesDao.getLances());
		
		return model;
		
	}
}
