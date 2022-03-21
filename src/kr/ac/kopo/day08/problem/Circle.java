package kr.ac.kopo.day08.problem;

public class Circle extends Figure{

	public Circle(String name, int r) {
		super(name, r);
	}
	
	@Override
	public void area() {
		area = (int)((r*r)*PI);
		super.area();
	}
}
