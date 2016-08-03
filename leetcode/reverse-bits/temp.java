public class temp{


	public static void main(String[] args){

		int i = Integer.MIN_VALUE;
		while(i<-1){
			System.out.println(i);
			System.out.println(Integer.toBinaryString(i));
			i= i>>1;
		}
	}

}