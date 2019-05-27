package com.zell.practice;

import com.zell.practice.thread.Task;
import com.zell.practice.local.basic.AbstractAnimal;
import com.zell.practice.local.basic.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

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
	@Test
	public void TestTaskWithReturn() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			try {
				Future<String> future = task.taskWithReturn(i);
				//System.out.println(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Thread.currentThread().join();
	}
}
