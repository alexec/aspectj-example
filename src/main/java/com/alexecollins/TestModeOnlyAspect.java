package com.alexecollins;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author alexec (alex.e.c@gmail.com)
 */
@Aspect
public class TestModeOnlyAspect {
	@Pointcut("execution(@com.alexecollins.TestModeOnly * *(..))")
	public void testModeOnlyMethods() {
	}

	@Before("testModeOnlyMethods()")
	public void testModeOnly(JoinPoint joinPoint) {
		if (!Boolean.getBoolean("test.mode.enabled")) {
			throw new TestModeOnlyException(joinPoint.toString());
		}
	}
}
