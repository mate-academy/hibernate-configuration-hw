package mate.academy.lib.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, RuntimeException exc) {
        super(message, exc);
    }
}
