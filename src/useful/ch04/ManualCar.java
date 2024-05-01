package useful.ch04;

public class ManualCar extends Car{

	@Override
	void drive() {
		System.out.println("부산 사람이 운전을 합니다.");
	}

	@Override
	void stop() {
		System.out.println("부산사람이 브레이크를 빡구 없이 밟습니다.");
	}

}
