package exceptions;

public class InvalidDiscountException extends RuntimeException {
    public InvalidDiscountException(String message) {
        super(message);
    }

    public InvalidDiscountException() {
        super("El descuento tiene que oscilar entre 0 y 100.");
    }
}
