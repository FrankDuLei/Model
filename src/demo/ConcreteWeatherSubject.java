package demo;

public class ConcreteWeatherSubject extends WeatherSubject {

	//"����" "����" "��ѩ"
	//Ŀ������״̬
	private String weatherContent;
	
	
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}

	@Override
	protected void notifyObservers() {
//		ѭ�����й۲���
		for (Observer observer : observers) {
			//�����ǣ�
			//������֪ͨ
			if("����".equals(this.getWeatherContent())) {
				if ("woman".equals(observer.getObserverName())) {
					observer.update(this);
				}
				if ("mum".equals(observer.getObserverName())) {
					observer.update(this);
				}
			}
		}
	}

	
}
