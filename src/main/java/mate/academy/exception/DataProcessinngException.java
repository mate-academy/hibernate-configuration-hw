package mate.academy.exception;

public class DataProcessinngException extends RuntimeException {
    public DataProcessinngException(String message, Throwable exception) {
        super(message, exception);
    }

    public DataProcessinngException(String message) {
        super(message);
    }
}
