package simulator;
import behavior.FlyRocketPowered;
import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		// 청둥오리 생성
		Duck mallard = new MallardDuck();
		// 청둥오리 울음소리
		mallard.performQuack();
		// 청둥오리 날기
		mallard.perfomFly();
		
		// 모형 오리 생성
		Duck model = new ModelDuck();
		// 모형 오리 날기
		model.perfomFly();
		// 모형 오리 나는 행동 변경 -> 로켓 추진 날기
		model.setFlyBehavior(new FlyRocketPowered());
		// 모형 오리 날기
		model.perfomFly();
	}
}
