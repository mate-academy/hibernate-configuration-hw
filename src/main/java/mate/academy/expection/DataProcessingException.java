package mate.academy.expection;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
