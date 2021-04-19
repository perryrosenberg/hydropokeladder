package com.iate.pokeladder.pokeladder.service;

import com.iate.pokeladder.pokeladder.data.PokeLadderDatastore;
import com.iate.pokeladder.pokeladder.model.PokeLadder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EloDownloaderService {

	@Autowired
	private UsernameService usernameService;

	@Autowired
	private PokeLadderDatastore pokeLadderDatastore;


	@Scheduled(fixedDelay = 20000, initialDelay = 3000)
	public void downloadElos() {
		List<String> allUsernames = usernameService.getAllUsernames();

		List<PokeLadder> pokeLadders = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		for (int i = 0; i < allUsernames.size(); i++) {
			PokeLadder pokeLadder = restTemplate
					.getForObject("https://pokemonshowdown.com/users/" + allUsernames.get(i) + ".json", PokeLadder.class);
			pokeLadders.add(pokeLadder);

			pokeLadderDatastore.addToDataStore(pokeLadder.getUsername(), pokeLadder);
		}
	}
}
