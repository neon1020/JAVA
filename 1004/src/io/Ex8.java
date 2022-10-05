package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex8 {

	public static void main(String[] args) {
		
		/*
		 * 객체 직렬화 (Serialization) & 역직렬화 (Deserialization)
		 * 
		 * - 자바에서 사용하는 객체에 영속성을 부여하여
		 *   파일 또는 네트워크 등으로 내보내는 것을 직렬화라고 하며,
		 *   반대로 파일이나 네트워크로부터 데이터를 읽어 객체로 변환하는 것을 역직렬화라고 함
		 *   
		 * - ObjectInputStream, ObjectOutputStream 클래스 사용
		 * 
		 * - 주의! 직렬화 대상이 되는 클래스를 정의할 때는
		 *   반드시 Serializable 인터페이스 상속 필수
		 *    
		 * - 만약, 직렬화 클래스 내에서 출력 대상으로부터 제외시킬 변수가 있을 경우
		 *   해당 변수 선언부 앞에 transient 키워드를 사용하면 출력대상에서 제외됨
		 * */
		
		// Person 객체 생성
		Person p = new Person("홍길동", 20, "999999-1234567");
		
		// File 경로 관리를 위한 File 객체 생성
		File f = new File("C:\\temp\\person.txt");
		
		// Person 객체를 외부 파일로 출력하기 (= 직렬화, Serialization)
		// => ObjectOutputStream 객체를 생성하여 FileOutputStream 객체 연결
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			
			oos.writeObject(p);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("객체 출력 완료");
		
		// ---------------------------------------------------------------------------------------
		
		// 외부 폴더(C드라이브 - temp - person.txt)에 저장되어 있는 파일 내의
		// Person 객체를 ObjectInputStream 객체 사용하여 읽어오기
		// => 역질렬화 (Deserializtion)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			
			Object o = ois.readObject();
			
			if(o instanceof Person) {
				Person person = (Person)o;
				System.out.println(person);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

// 직렬화 대상이되는 클래스를 정의할 때 반드시 Serializable 인터페이스 상속 필수!
// 별도의 추상메소드가 없는 단순한 마커(Marker) 용도의 인터페이스
class Person implements Serializable {
	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
}
