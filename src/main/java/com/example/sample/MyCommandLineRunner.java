package com.example.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.sample.entity.User;
import com.example.sample.repo.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class MyCommandLineRunner implements CommandLineRunner{

	private final UserRepository userRepository;
	
	@Override
	public void run(String... args)throws Exception{
		System.out.println("start");
		
		userRepository.save(new User("taro@gmail.com", "taro", "password"));
		
		System.out.println("finish");
	}
	
}
