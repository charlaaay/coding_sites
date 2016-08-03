
public class MyQueueTester {

	public static void main(String[] args){
		
		MyQueue queue = new MyQueue();
		
		for(int i = 0; i<10; i++){
			queue.push(i);
			if(i%2 == 0){
				queue.pop();
			}
		}
		System.out.println(queue.peek());
	}
}
