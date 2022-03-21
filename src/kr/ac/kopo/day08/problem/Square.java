package kr.ac.kopo.day08.problem;

public class Square extends Figure{
	
	public Square(String name, int r) {
		super(name, r);
	}
	
	@Override
	public void area() {
		area = (r*r);
		super.area();
	}
}
