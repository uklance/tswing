package com.tswing.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@UseWith({COMPONENT,MIXIN,PAGE})
public @interface SetupRender {
}
