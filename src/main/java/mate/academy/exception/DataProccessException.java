package mate.academy.exception;

public class DataProccessException extends RuntimeException {
    public DataProccessException(String message, Exception cause) {
        super(message, cause);
    }
}
