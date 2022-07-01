
public interface Observer {
	// 기상 정보가 변경되었을때 상태값 업데이트
	public void update(float temperature, float humidity, float pressure);
}
