
class Demo {  
	public static void main(String[] args) {
		int a = 4;
//		if(a == checkit()) {
//			System.out.println("waar");
//		}
			// false ||    
		if(++a == 9 & checkit() == 6) {
			System.out.println("tweede waar clausule");
		}
		// & | ^    bitwise
		
		// 10      1010
		// 3       0011
		//-------------    1011     0010  1001
		
		int r = 10 ^ 3;
		System.out.println(r);
	}
	static int checkit() {
		System.out.println("we zitten in checkit");
		return 5;
	}
}


