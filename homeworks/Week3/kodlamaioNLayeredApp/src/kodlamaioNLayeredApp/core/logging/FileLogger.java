package kodlamaioNLayeredApp.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged into file : "+message);

    }
}
