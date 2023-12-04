package exceptions;

public class HandleInputNumbersException extends Exception {
    public HandleInputNumbersException (String message) {
        String ciao = "YOU MUST INSERT NUMBER FROM 1 TO 10";
        System.out.println(ciao);
    }
}
