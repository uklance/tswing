package com.tswing;

/**
 * Callback interface for a {@linkplain org.apache.tapestry5.runtime.Event render phase event} or
 *
 * {@link org.apache.tapestry5.runtime.ComponentEvent}, notified when a non-null value is returned from some event
 *       handler method.
 */
public interface ComponentEventCallback<T>
{
    /**
     * Invoked to handle a non-null event handler method result. The handler should determine whether the value is
     * acceptable, and throw an exception if not. Any thrown exception will be wrapped to identify the component and
     * method from which the value was returned.
     *
     * Boolean values are <em>not</em> passed to the callback. Booleans are used to indicate that the event has been
     * handled (true, meaning the event is handled and aborted) or that a further search for handlers should continue
     * (false, meaning the event was not handled, is not aborted, and the search up the component hierarchy for event
     * handler methods should continue). If a component event method returns true, then
     * {@link org.apache.tapestry5.runtime.Event#isAborted()} will return true.
     *
     * @param result
     *            the result value returned from the event handler method
     * @return true if the event is aborted, false if the event may continue
     */
    boolean handleResult(T result);
}
