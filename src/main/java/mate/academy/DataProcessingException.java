package mate.academy;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable error) {
        super(message, error);
    }
}
