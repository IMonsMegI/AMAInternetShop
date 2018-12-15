package com.andrushenko.aspect;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SessionFactoryManagerAspect {
//    @Inject
//    private SessionFactory sessionFactory;
//
//    private Session getSession() {
//        return sessionFactory.openSession();
//    }
//
//    private void closeSession() {
//        sessionFactory.close();
//    }
//
//    public void beforeDaoMethodInvocation(JoinPoint joinPoint) {
//        getSession();
//    }
//
//    public void afterDaoMethodInvocation(JoinPoint joinPoint) {
//        sessionFactory.close();
//    }
//
//    public void aroundDaoMethodInvocation(ProceedingJoinPoint pjp) throws Throwable {
//        getSession();
//        pjp.proceed();
//        closeSession();
//    }
}
