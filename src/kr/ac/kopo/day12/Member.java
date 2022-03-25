package kr.ac.kopo.day12;

import java.util.Objects;

public class Member {

		private String name;
		private String phone;
		
		public Member() {
			
		}

		public Member(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}

		@Override
		public String toString() { //toString은 원래 object꺼 자기 입맛에 맞게 수정 가능
			return "Member [name=" + name + ", phone=" + phone + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, phone);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Member other = (Member) obj;
			return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
		}

		
		
		
		/*
//		public boolean equals(Object obj = new Member("홍길동", "010-1111-2222")) - 묵시적형변환
		@Override
		public boolean equals(Object obj) {
			if(obj == null) {
				return false;
			} //this.name/phone = null 이면 안됨
			
			Member m = (Member)obj; // 형변환 (Member)obj = name;
			if(this.name != null && !this.name.equals(m.name)) { // name string형 equals
				return false;
			}
			if(this.phone != null && this.phone.equals(m.phone)) {
				return false;
			}
			return true;
			*/
		}
		

