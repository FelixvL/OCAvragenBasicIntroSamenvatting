
class Demo {  
	public static void main(String[] args) {
		Fiets f = new Fiets();
		Fiets f2 = new Fiets();
		Fiets f3 = new Fiets();
		Fiets f4 = new Fiets();
	}
}


class Fiets{
	Fiets(){
		System.out.println("Dit is de constructor");
	}
	static { /// static initialiser block
		System.out.println("De klasse fiets wordt geladen");
	}
	{
		System.out.println("Het object fiets wordt geladen");
	}
	static int test = vulTest();
	static int vulTest() {
		System.out.println("ik zit in vul test");
		return 5;
	}
	int nietStatisch = vulnietStatisch();
	int vulnietStatisch() {
		System.out.println("in vul niet statisch");
		return 7;
	}

}