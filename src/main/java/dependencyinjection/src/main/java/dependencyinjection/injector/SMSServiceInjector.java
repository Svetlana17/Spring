package dependencyinjection.src.main.java.dependencyinjection.injector;




import dependencyinjection.src.main.java.dependencyinjection.consumer.Consumer;
import dependencyinjection.src.main.java.dependencyinjection.consumer.MyDIApplication;
import dependencyinjection.src.main.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());//недрение зависимости через конструктор
	}

}
