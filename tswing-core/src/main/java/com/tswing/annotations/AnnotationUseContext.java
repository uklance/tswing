package com.tswing.annotations;

public enum AnnotationUseContext
{
    /**
     * Annotation may be used on/in component classes
     */
    COMPONENT,

    /**
     * Annotation may be used on/in mixins
     */
    MIXIN,

    /**
     * Annotation may be used on modules
     */
    MODULE,

    /**
     * Annotation may be used on/in page classes
     */
    PAGE,

    /**
     * Annotation may be used on/in services
     */
    SERVICE,

    /**
     * Annotation may be used for service decorators
     */
    SERVICE_DECORATOR,

    /**
     * Annotation may be used on/in arbitrary java beans.
     */
    BEAN
}
