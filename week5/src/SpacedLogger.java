
public class SpacedLogger implements Logger {

	
	@Override
	public void Log(String log) {
		System.out.println(userInput(log));
		}
	
	
	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + userInput(error));
		System.out.println("");
	}
	private String userInput(String userInput) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < userInput.length(); i++) {
			if (i < userInput.length() - 1) {
				result.append(userInput.charAt(i));
				result.append(" ");
			}else {
				result.append(userInput.charAt(i));
			}
		}
		return result.toString();
	}
}

