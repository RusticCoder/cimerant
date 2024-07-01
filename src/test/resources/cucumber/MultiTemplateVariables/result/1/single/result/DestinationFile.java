import DestinationFile.AnotherMessage;
import DestinationFile.GenerateMessage;

/**
 * Destination file.
 */
public final class DestinationFile {
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
   * Generate message3.
   */
  private static final class GenerateMessage3 {
    private static String generateMessage() {
      return "Here's message #3";
    }
  }

  /**
   * Generate message4.
   */
  private static final class GenerateMessage4 {
    private static String generateMessage() {
      return "Here's message #4";
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

  private DestinationFile() {}
}
