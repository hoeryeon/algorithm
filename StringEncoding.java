public class StringEncoding {
	public static void main (String[] args) {
		String string = "한글";  
		byte[] bytes = string.getBytes();  
		for (byte b : bytes) {  
    			System.out.print(String.format("0x%02X ", b));
		}		
		System.out.println(); 
	}
}
