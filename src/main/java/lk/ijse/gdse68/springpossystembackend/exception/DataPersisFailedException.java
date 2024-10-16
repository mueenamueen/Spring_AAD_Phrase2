package lk.ijse.gdse68.springpossystembackend.exception;

public class DataPersisFailedException extends RuntimeException{
    public DataPersisFailedException() {
        super();
    }

    public DataPersisFailedException(String message) {
        super(message);
    }

    public DataPersisFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
