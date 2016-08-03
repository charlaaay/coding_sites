
public class MyStackTester {

    public static void main(String[] args){
    	
    	
    	MyStack stack = new MyStack();
    	if(stack.empty()){
    		System.out.println("I am empty right now");
    	}
    	else{
    		System.out.println("I am not empty");
    	}
    	for(int i = 0; i<10; i++){
    		stack.push(i);
    	}
    	for(int i = 0; i<5; i++){
    	stack.pop();
    	}
    	System.out.println(stack.top());
    }
}
