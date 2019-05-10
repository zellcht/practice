package com.zell.practice.Thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Z on 2019/5/10.
 */
@Component
public class Task {
    @Async(value="ThreadPoolA")
    public void task(int i) throws Exception {
        System.out.println("===task start===" + i);
        Thread.sleep(1000L);
        System.out.println("===task end===" + i);
    }
}
