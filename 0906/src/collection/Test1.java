package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Stack 객체 1개 생성 (stack)
		 * => 웹사이트 주소 4~5개 추가
		 * => 반복문 사용하여 Top에서 부터 하나씩 객체를 꺼내서 출력 후 제거(pop())
		 * */
		
		Stack stack = new Stack();
		stack.push("naver");
		stack.push("daum");
		stack.push("yahoo");
		stack.push("youtube");
		
		// System.out.println(stack.empty());
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("-------------------");
		
		/*
		 * Queue 객체 1개 생성
		 * => 파일 4~5개 추가
		 * => 반복문을 사용하여 하나씩 객체를 꺼내서 출력 후 제거 (poll())
		 * */
		
		Queue q = new LinkedList();
		
		q.offer("naver");
		q.offer("daum");
		q.offer("yahoo");
		q.offer("youtube");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
