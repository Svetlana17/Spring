package dependencyinjection.src.main.java.dependencyinjection.injector;


import dependencyinjection.src.main.java.dependencyinjection.consumer.Consumer;
import dependencyinjection.src.main.java.dependencyinjection.consumer.MyDIApplication;
import dependencyinjection.src.main.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());//внедрение зависимости черз setor
		return app;
	}

}
