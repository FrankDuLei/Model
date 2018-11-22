package demo;

public class Client {

	public static void main(String[] args) {
		//创建目标
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		//创建观察者
		ConcreteObserver observerGril = new ConcreteObserver();
		observerGril.setObserverName("woman");
		observerGril.setRemindThing("不出门");
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("mum");
		observerMum.setRemindThing("不出门");
		//注册观察者
		subject.attach(observerGril);
		subject.attach(observerMum);
		//发布天气
		subject.setWeatherContent("下雨");
	}
}
