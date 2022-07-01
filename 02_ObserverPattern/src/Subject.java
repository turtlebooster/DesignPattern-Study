
public interface Subject {
	// 옵저버 등록
	public void registerObserver(Observer observer);
	// 옵저버 제거
	public void removeObserver(Observer observer);
	// 상태 변경시 모든 옵저버에게 변경 내용 전달
	public void notifyObservers();
}
