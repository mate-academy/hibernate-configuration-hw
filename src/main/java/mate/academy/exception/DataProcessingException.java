package mate.academy.exception;

public class DataProcessingException extends Exception {
    public DataProcessingException(String message, Exception e) {
        super(message);
    }
}
