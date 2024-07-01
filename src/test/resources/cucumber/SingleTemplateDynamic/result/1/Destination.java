import Destination.AnotherMessage;
import Destination.GenerateMessage;

/**
 * Destination file.
 */
public final class Destination {
  /**
   * Another message.
   */
  private static final class AnotherMessage {
    private static String generateAnotherMessage() {
      return "Here is another message";
    }
  }

  /**
   * Generate message.
   */
  private static final class GenerateMessage {
    private static String generateMessage() {
      return "Here is one message";
    }
  }

  /**
   * Main.
   *
   * @param args arguments
   */
  public static void main(final String[] args) {

    System.out.println(GenerateMessage.generateMessage());
    System.out.println(AnotherMessage.generateAnotherMessage());
  }

  private Destination() {}
}
