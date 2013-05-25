package com.alexecollins;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates should only work if system property test.mode.enabled = true.
 * <p/>
 * Warning: code annotated with this class must be complied using AspectJ, i.e. you cannot use it outside this
 * project without adding the AspectJ compiler to it.
 *
 * @author alexec (alex.e.c@gmail.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestModeOnly {
}
