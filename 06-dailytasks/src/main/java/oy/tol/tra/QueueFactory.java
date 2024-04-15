package oy.tol.tra;

/**
 * This class instantiates a queue implementing the {@code QueueInterface}.
 *
 * @author Antti Juustila
 */
public class QueueFactory {

    private QueueFactory() {
    }
    public static QueueInterface<Integer> createIntegerQueue(int capacity) {
        return new QueueImplementation<>(capacity);
    }
}
