package Kodlama.io.core.Logging;

public class databaseLogger implements ILogger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Veri tabanına loglandı : "+data);
	}

}
