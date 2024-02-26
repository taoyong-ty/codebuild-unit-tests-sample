import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

  String message = "Robert";	
  MessageUtil messageUtil = new MessageUtil(message);
   
  @Test
  public void testPrintMessage() {	
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Robert";
    assertEquals(message,messageUtil.salutationMessage());
  }


  @Test
  public void testSetMessage() {
    System.out.println("Inside testSetMessage()");
    String newMsg = "John";
    messageUtil.setMessage(new String(newMsg));
    assertEquals(newMsg, messageUtil.printMessage());
  }

  @Test
  public void testPrintMessage1() {	
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage1() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Robert";
    assertEquals(message,messageUtil.salutationMessage());
  }


  @Test
  public void testSetMessage1() {
    System.out.println("Inside testSetMessage()");
    String newMsg = "John";
    messageUtil.setMessage(new String(newMsg));
    assertEquals(newMsg, messageUtil.printMessage());
  }

  @Test
  public void testPrintMessage2() {	
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage2() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!" + "Robert";
    assertEquals(message,messageUtil.salutationMessage());
  }


  @Test
  public void testSetMessage2() {
    System.out.println("Inside testSetMessage()");
    String newMsg = "John";
    messageUtil.setMessage(new String(newMsg));
    assertEquals(newMsg, messageUtil.printMessage());
  }

  @Test
  public void testSetMessage3() {
    System.out.println("Inside testSetMessage()");
    String newMsg = "John";
    messageUtil.setMessage(new String(newMsg));
    assertEquals(newMsg, messageUtil.printMessage());
  }
  
}

