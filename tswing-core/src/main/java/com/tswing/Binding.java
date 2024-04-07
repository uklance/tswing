package com.tswing;

/**
 * A binding is a connection between a component and its container (another component), that allows the embedded
 * component to gain access to <em>resources</em> defined by the container. Resources can represent any kind of value
 * that can be obtained from the parent component, but is often a JavaBean property that can be read and updated.
 * Different implementations of Binding are used to access different kinds of resources of the container.
 *
 * A binding ultimately must provide access to the underlying annotations. In most cases, there are no annotations, but
 * bindings that ultimate invoke methods or read and update fields must provide access to those annotations.
 */
public interface Binding extends AnnotationProvider {
    /**
     * Reads the current value of the property (or other resource). When reading properties of objects that are
     * primitive types, this will return an instance of the wrapper type. In some cases, a binding is read only and this
     * method will throw a runtime exception.
     */
    Object get();

    <T> T get(Class<T> type);

    /**
     * Updates the current value. Most types of bindings are read-only, and this method will throw a runtime exception.
     * It is the caller's responsibility to ensure that the value passed in is of the appropriate type.
     *
     * @param value
     */
    void set(Object value);
}