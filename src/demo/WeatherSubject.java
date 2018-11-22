package demo;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	
	//��������ע��Ĺ۲���
	public List<Observer> observers = new ArrayList<Observer>();
	
	//��Ӷ��������Ĺ۲���
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//ɾ���۲���
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	protected abstract void notifyObservers();
}
