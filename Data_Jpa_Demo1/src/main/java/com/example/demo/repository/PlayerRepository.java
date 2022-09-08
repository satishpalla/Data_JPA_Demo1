package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.Player;
@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer>{

	
	
}
