package demo;

public class Client {

	public static void main(String[] args) {
		//����Ŀ��
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		//�����۲���
		ConcreteObserver observerGril = new ConcreteObserver();
		observerGril.setObserverName("woman");
		observerGril.setRemindThing("������");
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("mum");
		observerMum.setRemindThing("������");
		//ע��۲���
		subject.attach(observerGril);
		subject.attach(observerMum);
		//��������
		subject.setWeatherContent("����");
	}
}
