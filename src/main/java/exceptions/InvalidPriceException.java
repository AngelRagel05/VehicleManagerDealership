package exceptions;

public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {
        super(message);
    }

    public InvalidPriceException() {
        super("El precio no puede ser menor a 0.");
    }
}
