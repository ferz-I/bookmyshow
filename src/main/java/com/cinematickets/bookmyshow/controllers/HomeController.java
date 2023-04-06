package com.cinematickets.bookmyshow.controllers;

import com.cinematickets.bookmyshow.models.Film;
import com.cinematickets.bookmyshow.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HomeController {
	@Autowired
	FilmRepository filmRepository;
	@GetMapping("/")
	public String home(Model model){
		return "home";
	}
	@GetMapping("/films/{id}")
	public String filmDetails(@PathVariable long id, Model model){
		Optional<Film> film = filmRepository.findById(id);
		return "film_details";
	}

}
