package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }
}
