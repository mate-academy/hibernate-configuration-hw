package mate.academy.lib;

public class DataProcessingException extends Exception {
    public DataProcessingException(String exceptionInformation, RuntimeException e) {
        super(exceptionInformation, e);
    }

    public DataProcessingException(String exceptionInformation) {
        super(exceptionInformation);
    }

    public DataProcessingException(RuntimeException e) {
        super(e);
    }
}

