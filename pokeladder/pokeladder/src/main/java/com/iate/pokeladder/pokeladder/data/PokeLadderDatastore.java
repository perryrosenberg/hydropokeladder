package com.iate.pokeladder.pokeladder.data;

import com.iate.pokeladder.pokeladder.model.PokeLadder;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;

@Service
@Data
public class PokeLadderDatastore {

	private Map<String, PokeLadder> userNameToPokeLadderMap = new HashMap<>();

	public void addToDataStore(String username, PokeLadder pokeLadder) {
		userNameToPokeLadderMap.put(username, pokeLadder);
	}

	public PokeLadder getFromDataStore(String username) {
		return userNameToPokeLadderMap.get(username);
	}

	public List<PokeLadder> getAllFromDataStore() {
		return userNameToPokeLadderMap.values().stream()
				.collect(Collectors.toList());
	}
}
