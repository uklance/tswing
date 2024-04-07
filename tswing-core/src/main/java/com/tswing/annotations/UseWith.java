package com.tswing.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(SOURCE)
@Documented
public @interface UseWith
{
    AnnotationUseContext[] value();
}
