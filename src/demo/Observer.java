package demo;
/**
 * ����һ�����µĽӿڷ�������Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ĺ۲��߶������
 * @author LXZ
 *
 */
public interface Observer {

	//���µĽӿ�
	public void update(WeatherSubject subject);
	
	//���ù۲��ߵ�����
	public void setObserverName(String observerName);
	
	//ȡ�ù۲��ߵ�����
	public String getObserverName();
	
	//
}
