
public class Arrays {

	int num;
	String hire;
	int raise;
	
	public static void main(String[] args) {
		
		Arrays a = new Arrays();
		Arrays b = new Arrays();
		
		a.setNum(123);
		a.setHire("Dec 23rd");
		a.setRaise(100);
		
		b.setNum(125);
		b.setHire("Aug 4th");
		b.setRaise(10000);
		
		System.out.println(a.getNum());
		System.out.println(a.getHire());
		System.out.println(a.getRaise());
		
		System.out.println(b.getHire());
		System.out.println(b.getNum());
		System.out.println(b.getRaise());
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getHire() {
		return hire;
	}

	public void setHire(String hire) {
		this.hire = hire;
	}

	public int getRaise() {
		return raise;
	}

	public void setRaise(int raise) {
		this.raise = raise;
	}
	
	
	
	}


