package behavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("나는 날지 못합니다. ㅠㅠ");
	}

}
