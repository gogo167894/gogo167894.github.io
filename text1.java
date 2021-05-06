class SportsCar extends Car {
	boolean turbo;
	
	public void setTurbo(boolean flag) {
		turbo = flag;
	}
	public SportsCar() {
		System.out.println("----------SportsCar----------");
	}
}





class Car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar obj = new SportsCar();
		obj.speed = 10;
		obj.setSpeed(60);
		obj.setTurbo(true);
	}

}
