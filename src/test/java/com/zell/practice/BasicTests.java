package com.zell.practice;

import com.zell.practice.basic.AbstractAnimal;
import com.zell.practice.basic.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTests {

	@Test
	public void Test() {
		AbstractAnimal user = new Cat();
		user.methodA();
		user.methodB();
	}

}
