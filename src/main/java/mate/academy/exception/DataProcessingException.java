package mate.academy.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String massage) {
        super(massage);
    }

    public DataProcessingException(String massage, Exception e) {
        super(massage, e);
    }
}
