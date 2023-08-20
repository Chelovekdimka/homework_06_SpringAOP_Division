package ex_05.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyLogger {

    @AfterThrowing(pointcut = "execution(* divide(..))", throwing = "ex")
    public void dividedByZero(JoinPoint joinPoint, ArithmeticException ex) {
        System.out.println("Exception in method " + joinPoint.getSignature().getName() + ": " + ex.getMessage());
    }


}