package mate.academy.model;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String text, Throwable e) {
        super(text, e);
    }
}
