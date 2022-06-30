package behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("--음소거 모드--");
	}

}
