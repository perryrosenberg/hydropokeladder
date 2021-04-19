package com.iate.pokeladder.pokeladder.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsernameService {
	public List<String> getAllUsernames() {
//		List<String> usernameList = new ArrayList<>();
//		usernameList.add("vs_deluge");
//		return usernameList;

		return Arrays.asList("vs_deluge");
	}
}
