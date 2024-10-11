package Task1;

public class Calculator {
	public boolean validInputAdd(Object value) {
		if (value instanceof Integer || value instanceof Float || value instanceof Double) {
            return true;
        }
		if (value instanceof Character) {
            return false;
        }
		return false;
	}
}
