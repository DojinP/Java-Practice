package thread.sync;

public class User extends Thread {
	String name;
	Toilet toilet;
	
	public User(String name, Toilet toilet) {
		super();
		this.name = name;
		this.toilet = toilet;
	}

	@Override
	public void run() {
		// 쓰레드로 실행할 코드
		toilet.open(name);
	}
	
}
