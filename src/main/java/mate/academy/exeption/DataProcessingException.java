package mate.academy.exeption;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable throwable) {
        super(message);
    }
}
