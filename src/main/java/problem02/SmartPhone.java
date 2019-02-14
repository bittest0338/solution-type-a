package problem02;

public class SmartPhone extends MusicPhone {
	
	String res;
	public void execute(String function) {
		if(function.equals("음악")) {
			String x = "two";
			System.out.println(runApp(x));
			return;
		}else if(function.equals("앱")){
			String x = "three";
			System.out.println(runApp(x));
			return;
		}
		
		super.execute(function);
		
	}
	public String runApp(String x) {
		if(x.equals("two")) {
			res="스트리밍";
		}else if(x.equals("three")) {
			res="앱실행";
		}
		return res;
	}
}