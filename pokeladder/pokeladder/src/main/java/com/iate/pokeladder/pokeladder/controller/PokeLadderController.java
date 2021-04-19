package com.iate.pokeladder.pokeladder.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iate.pokeladder.pokeladder.data.PokeLadderDatastore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokeLadderController {

	@Autowired
	private PokeLadderDatastore pokeLadderDatastore;

	@RequestMapping(value = "/index")
	public @ResponseBody String index() throws Exception {
		return new ObjectMapper().writeValueAsString(pokeLadderDatastore.getAllFromDataStore());
	}

}