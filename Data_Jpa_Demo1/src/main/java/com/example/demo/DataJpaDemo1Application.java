package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.Player;
import com.example.demo.repository.PlayerRepository;

@SpringBootApplication
public class DataJpaDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac= SpringApplication.run(DataJpaDemo1Application.class, args);
	Player player=new Player();
	player.setP_id(101);
player.setP_name("Karthik");
	
	player.setP_gender("Other");
	player.setP_age(45);
	
	PlayerRepository pr=cac.getBean(PlayerRepository.class);

pr.save(player);

System.out.println("Inserted");
	}

}
