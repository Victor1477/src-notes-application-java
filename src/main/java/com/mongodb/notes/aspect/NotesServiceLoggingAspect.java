package com.mongodb.notes.aspect;

import com.mongodb.notes.core.model.NotesModel;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Aspect
@Component
public class NotesServiceLoggingAspect {

    @Around("execution(public * com.mongodb.notes.core.service.NotesService.getAll())")
    public Object getAll(ProceedingJoinPoint pjp) throws Throwable {
        String className = pjp.getTarget().getClass().getSimpleName();
        String methodName = pjp.getSignature().getName();
        Object result = pjp.proceed();
        if (result instanceof List<?> list)
            System.out.printf("%s - [%s] Calling %s returned list with %d items %n", getTime(), className, methodName, list.size());
        else
            System.out.printf("%s - [%s] Calling %s returned null %n", getTime(), className, methodName);
        return result;
    }

    @Around("execution(public * com.mongodb.notes.core.service.NotesService.save(com.mongodb.notes.core.model.NotesModel))")
    public Object save(ProceedingJoinPoint pjp) throws Throwable {
        String className = pjp.getTarget().getClass().getSimpleName();
        String methodName = pjp.getSignature().getName();
        Object result = pjp.proceed();
        if (result instanceof NotesModel notesModel)
            System.out.printf("%s - [%s] Calling %s returned notesModel id: %s %n", getTime(), className, methodName, notesModel.getId());
        else
            System.out.printf("%s - [%s] Calling %s returned null %n", getTime(), className, methodName);
        return result;
    }

    @Around("execution(public * com.mongodb.notes.core.service.NotesService.delete(java.lang.String))")
    public void delete(ProceedingJoinPoint pjp) throws Throwable {
        String className = pjp.getTarget().getClass().getSimpleName();
        String methodName = pjp.getSignature().getName();
        pjp.proceed();
        System.out.printf("%s - [%s] Calling %s with id: %s%n", getTime(), className, methodName, pjp.getArgs()[0]);

    }

    private LocalDateTime getTime() {
        return LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }
}
