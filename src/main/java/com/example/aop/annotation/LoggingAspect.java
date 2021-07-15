package com.example.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
@Aspect
public class LoggingAspect {

    @Around("@annotation(LogExecutionTime)")
    public void logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        int start = OffsetDateTime.now().getNano();
        joinPoint.proceed();
        int executionTime = OffsetDateTime.now().getNano() - start;
        System.out.println("Execution time is " + executionTime);
    }
}
