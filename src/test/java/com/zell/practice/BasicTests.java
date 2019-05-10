package com.zell.practice;

import com.zell.practice.Thread.Task;
import com.zell.practice.basic.AbstractAnimal;
import com.zell.practice.basic.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTests {
	@Autowired
	private Task task;

	@Test
	public void Test() {
		AbstractAnimal animal = new Cat();
	}

	@Test
	public void TestTask() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			try {
				task.task(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Thread.currentThread().join();
	}

}
