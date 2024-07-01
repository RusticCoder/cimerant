import DestinationFile2.AnotherMessage;
import DestinationFile2.GenerateMessage;

/**
 * Destination file.
 */
public final class DestinationFile2 {
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

  private DestinationFile2() {}
}
