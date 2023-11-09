package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String text) {
        super(text);
    }

    public DataProcessingException(String text, Exception e) {
        super(text, e);
    }
}
