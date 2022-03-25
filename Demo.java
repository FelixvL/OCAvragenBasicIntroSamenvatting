
class Demo {  
	public static void main(String[] args) {
		Rekenmachine r = new Rekenmachine();
//		r.optellen(5, 7);
	//	r.optellen();
		r.optellen(6,5,4,8,9,1001);
		int[] getallen = new int[4];
		r.optellen(getallen);
	}
}

class Rekenmachine{
	void optellen(int... a) {  // varargs
		System.out.println(a[3]);
	}
}