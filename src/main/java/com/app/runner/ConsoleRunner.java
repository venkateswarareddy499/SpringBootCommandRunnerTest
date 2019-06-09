package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements ApplicationRunner {

	
	public void run(ApplicationArguments args) throws Exception {
		
// option args
		Set <String> optionkeys=args.getOptionNames();
		System.out.println(optionkeys);
		//one key related values
		List<String> List=args.getOptionValues("profile");
		System.out.println(List);
		// CHECK FOR KEY EXIST
		System.out.println("nature");
		System.out.println("db");
		//Non option
		List <String> Donop=args.getNonOptionArgs();
		System.out.println(Donop);
		//aLL ARGS
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
	}

}
