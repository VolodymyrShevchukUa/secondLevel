package secondweek;

public class MyOwnException extends RuntimeException{

    public MyOwnException(String message,Throwable throwable) {
        super(message,throwable);
        Assigment2.logger.error("I don`t know if i make well",this);
    }
}
