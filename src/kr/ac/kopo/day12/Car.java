package kr.ac.kopo.day12;

public class Car {

		private String name;
		private String carNumber;
		
		public Car() {
			
		}
		
		public Car(String name, String carNumber) {
			super();
			this.name = name;
			this.carNumber = carNumber;
		}

		@Override
		public String toString() { //toString은 원래 object꺼 자기 입맛에 맞게 수정 가능
			return "Car [name=" + name + ", carNumber=" + carNumber + "]";
		}
		
	}


