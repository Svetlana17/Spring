package dependencyinjection.src.main.java.dependencyinjection.service;

public class FacebookServiceImpl implements  MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Facebook" + rec+ "with Message" +msg );
    }
}
