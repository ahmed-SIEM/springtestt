package com.example.springtestt.Configurations;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j

public class LoggingAspect {
    @Before("execution(* com.example.springtestt.services.*.retrieve*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("avant de s excuter " + name + " : ");
    }

    @After("execution(* com.example.springtestt.services.*.add*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("ajout avec success " + name + " : ");
    }
    @AfterReturning("execution(* com.example.springtestt.services.*.add*(..))")
    public void logMethodExitcorrect(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("ajout avec success correct " + name + " : ");
    }
    @AfterThrowing("execution(* com.example.springtestt.services.*.add*(..))")
    public void logMethodEntrythrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("erreur detecte " + name + " : ");
    }
}
