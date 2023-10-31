package mate.academy.exeption;

public class DataProcessingException extends RuntimeException {
    private String message;

    public DataProcessingException(String message) {
        super(message);
    }
}
