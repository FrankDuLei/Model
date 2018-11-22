package demo;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	
	//用来保存注册的观察者
	public List<Observer> observers = new ArrayList<Observer>();
	
	//添加订阅天气的观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//删除观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	protected abstract void notifyObservers();
}
