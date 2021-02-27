package Hospital;

import java.io.Serial;

public class RemoveException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public RemoveException(String message) {
        super(message);
    }
}
