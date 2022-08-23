package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String  messages, Throwable cause) {
        super(messages, cause);
    }
}
