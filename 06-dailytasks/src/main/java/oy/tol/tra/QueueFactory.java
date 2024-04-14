package oy.tol.tra;

/**
 * This class instantiates a queue implementing the {@code QueueInterface}.
 *
 * @author Antti Juustila
 */
public class QueueFactory {

    private QueueFactory() {
    }

    /**
     * Creates an instance of QueueInterface for Integer type.
     * @param capacity Number of elements the queue can hold.
     * @return The queue object.
     */
    public static oy.tol.tra.QueueInterface<Integer> createIntegerQueue(int capacity) {
        // TODO: Implement this when you have finished your QueueImplementation.
        // - Instantiates your queue implementation using Integer as template parameter,
        //   with the given capacity,
        // - and return the object to the caller.
        return new oy.tol.tra.QueueImplementation<Integer>(capacity);
    }

    /**
     * Creates an instance of QueueInterface for Integer type.
     * Use the default constructor of the queue.
     * @return The queue object.
     */
    public static oy.tol.tra.QueueInterface<Integer> createIntegerQueue() {
        //    // TODO: Implement this when you have finished your QueueImplementation.
        //    // - Instantiates your queue implementation using Integer as template parameter,
        //    //   with default capacity,
        //    // - and return the object to the caller.
        return new oy.tol.tra.QueueImplementation<>();
    }

}