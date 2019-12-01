package com.inc.emrys.rojaya;

import com.inc.emrys.rojaya.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RojayaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RojayaApplication.class, args);

		MyController myController = (MyController)ctx.getBean("myController");


		myController.getBean();

	}

}
