package mate.academy.exception;

import java.io.Serial;

@SuppressWarnings("unused")
public class DataProcessingException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DataProcessingException() {
        super();
    }

    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataProcessingException(Throwable cause) {
        super(cause);
    }
}
