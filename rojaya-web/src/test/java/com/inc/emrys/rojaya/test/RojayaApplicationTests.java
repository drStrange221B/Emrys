package com.inc.emrys.rojaya.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RojayaApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void  getTested(){



		Demo test;
		test = new Demo();

		test.go();

	}

}
