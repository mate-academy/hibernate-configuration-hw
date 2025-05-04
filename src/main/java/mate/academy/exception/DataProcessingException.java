package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
