package eventhub;

public class Main {

	public static void main(String[] args) {
		
		MyLogger logger = MyLogger.getLogger();
		logger.log("log start");
		
		String str = "temp";
		boolean empty = str.isEmpty();
		
		if(empty) {
			logger.log("empty");
		}else {
			logger.log("full");
		}
		
	}

}
