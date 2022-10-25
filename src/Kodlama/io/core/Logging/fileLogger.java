package Kodlama.io.core.Logging;

public class fileLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("dosyaya loglandı : "+data);
	}

}
