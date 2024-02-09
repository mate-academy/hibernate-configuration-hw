package mate.academy;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String msg) {
        super(msg);
    }
    
    public DataProcessingException(String msg, Throwable e) {
        super(msg, e);
    }
}
