
class Demo {  
	public static void main(String[] args) {
		String a = new String("hallo ");
		a.concat("doei");
		System.out.println(a);
		a = a.concat("doei");
		StringBuilder sba = new StringBuilder("hoi ");
		sba.append("houdoe");
		System.out.println(a);
		System.out.println(sba);
	}
}

// hallo
// hoi houdoe

