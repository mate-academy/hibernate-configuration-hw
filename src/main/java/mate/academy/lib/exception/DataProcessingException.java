package mate.academy.lib.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Exception e) {
        super(message, e);
    }
}
