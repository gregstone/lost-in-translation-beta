package com.jd.lostintranslation;

import api.googleTranslate.GoogleTranslate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LostInTranslationApplication {

	public static void main(String[] args) {

		SpringApplication.run(LostInTranslationApplication.class, args);

		// call google translate api
		GoogleTranslate translate = new GoogleTranslate();
		translate.googleTranslate();

	}

}
