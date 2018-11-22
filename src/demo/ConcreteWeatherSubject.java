package demo;

public class ConcreteWeatherSubject extends WeatherSubject {

	//"晴天" "下雨" "下雪"
	//目标对象的状态
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
//		循环所有观察者
		for (Observer observer : observers) {
			//规则是：
			//按类型通知
			if("下雨".equals(this.getWeatherContent())) {
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
