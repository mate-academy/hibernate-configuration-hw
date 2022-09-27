package mate.academy.exeptions;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException() {
    }

    public DataProcessingException(String message) {
        super(message);
    }
}
