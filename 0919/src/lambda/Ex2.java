package lambda;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		Customer c1 = new Customer("김감자", 12, 1000);
		Customer c2 = new Customer("박둘기", 20, 400);
		Customer c3 = new Customer("최사과", 22, 500);
		Customer c4 = new Customer("정고기", 30, 600);
		Customer c5 = new Customer("하삼색", 40, 700);
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		System.out.println("==== 추가된 순서대로 고객 명단(이름만) 출력 ====");
		list.stream().map(c -> c.getName()).forEach(c -> System.out.println(c));
		System.out.println();
		
		int total = list.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total + "원 입니다.");
		System.out.println();
		
		System.out.println("==== 30세 이상 고객 중 여행비용이 큰 순으로 출력 ====");
		list.stream().filter(c -> c.getAge() >= 30)
					 .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
					 .forEach(c -> System.out.println(c));
		System.out.println();
		
		System.out.println("==== 가장 어린 사람의 정보 출력 ====");
		Customer customer = list.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get();
		System.out.println(customer);
		System.out.println();
		
		System.out.println("==== 가장 비용이 적은 사람 출력 ====");
		Customer customer2 = list.stream().min((o1, o2) -> o1.getPrice() - o2.getPrice()).get();
		System.out.println(customer2);
		System.out.println();
	}

}

class Customer {
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	// toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}