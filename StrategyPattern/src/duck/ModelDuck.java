package duck;

import behavior.FlyNoWay;
import behavior.Quack;

public class ModelDuck extends Duck {
	
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("모형 오리입니다.");
	}

}
