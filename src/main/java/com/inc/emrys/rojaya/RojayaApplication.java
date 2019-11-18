package com.inc.emrys.rojaya;

import com.inc.emrys.rojaya.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RojayaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RojayaApplication.class, args);


		System.out.println("Testing the example");

		Book book = new Book(1,"name","name","name",null);

		Book book1 = new Book(1,"name","name","name",null);

		System.out.println("equals :"+ book.equals(book1));

		System.out.println("== :" + (book==(book1)));

	}

}
