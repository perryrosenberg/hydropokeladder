package com.iate.pokeladder.pokeladder.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class PokeLadder implements Serializable {
	private String username;
	private String userId;
	private int registerTime;
	private int group;
	private Ratings ratings;
}



