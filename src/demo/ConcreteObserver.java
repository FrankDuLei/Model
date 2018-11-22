package demo;

public class ConcreteObserver implements Observer {

	//�۲�������
	private String observerName;
	
	//�������������
	private String weatherContent;
	
	//���ѵ�����
	private String remindThing;
	@Override
	public void update(WeatherSubject subject) {
		String weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName + "�յ���" + weatherContent + remindThing);
	}

	@Override
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public String getObserverName() {	
		return this.observerName;
	}
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	
}
