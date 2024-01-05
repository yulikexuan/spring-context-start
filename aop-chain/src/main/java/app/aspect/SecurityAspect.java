//: app.aspect.SecurityAspect.java


package app.aspect;


import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;


@Slf4j
@Aspect
@Order(2)
@NoArgsConstructor(staticName = "of")
public class SecurityAspect {

    @Around("@annotation(ToLogging)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info(">>> Security Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        log.info(">>> Security Aspect: Method executed and returned {}",
                returnedValue);

        return returnedValue;
    }

}///:~