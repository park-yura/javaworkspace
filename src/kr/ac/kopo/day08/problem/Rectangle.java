package kr.ac.kopo.day08.problem;

public class Rectangle extends Figure{

	public Rectangle(String name, int width, int height) {
		super(name, width, height);
	}
	
	@Override
	public void area() {
		area = (width * height);
		super.area();
	}
}
