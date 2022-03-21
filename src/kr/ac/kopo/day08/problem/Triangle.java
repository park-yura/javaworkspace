package kr.ac.kopo.day08.problem;

public class Triangle extends Figure{

	public Triangle(String name, int width, int height) {
		super(name, width, height);
	}
	
	@Override
	public void area() {
		area = (width * height)/2;
		super.area();
	}
}
