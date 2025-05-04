package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
