package com.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions {

	@Pointcut("execution(* com.aop.demo.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// create pointcut for getter methods
	@Pointcut("execution(* com.aop.demo.dao.*.get*(..))")
	public void getter() {
	}

	// create pointcut for setter methods
	@Pointcut("execution(* com.aop.demo.dao.*.set*(..))")
	public void setter() {
	}

	// create pointcut: include package and exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {
	}

}
