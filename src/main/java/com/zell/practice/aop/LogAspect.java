package com.zell.practice.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut("@annotation(com.zell.practice.annotation.LogEvent)")
    public void  logEvent(){
    }
    @Around("logEvent()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        log.info("===start===");
        log.info(JSON.toJSONString(proceedingJoinPoint.getArgs()));
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("===end===");
        return result;
    }
}
