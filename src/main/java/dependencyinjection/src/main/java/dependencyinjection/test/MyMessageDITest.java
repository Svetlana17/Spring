package dependencyinjection.src.main.java.dependencyinjection.test;


import dependencyinjection.src.main.java.dependencyinjection.consumer.Consumer;
import dependencyinjection.src.main.java.dependencyinjection.injector.EmailServiceInjector;
import dependencyinjection.src.main.java.dependencyinjection.injector.MessageServiceInjector;
import dependencyinjection.src.main.java.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;//выводит отправителя наружу
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();//реализуем интерфейс
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
