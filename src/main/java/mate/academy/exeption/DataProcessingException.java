package mate.academy.exeption;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Exception e) {
        super(message, e);
    }
}
