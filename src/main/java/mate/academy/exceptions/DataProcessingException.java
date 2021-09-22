package mate.academy.exceptions;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, RuntimeException e) {
        super(message, e);
    }
}
