public class HelloMessageUtil {

  public static void main(String[] args) {
	  
    String message = "Robert";	
    MessageUtil messageUtil = new MessageUtil(message);
    
    System.out.println("Inside main()");
    messageUtil.printMessage();
    messageUtil.salutationMessage();   	
  }
}
