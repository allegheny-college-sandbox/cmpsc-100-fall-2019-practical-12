package heist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunHeist {
  
  public static void main(String[] args) {
    Safe safe = new Safe();
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/keys.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    Key key;
    boolean isCracked;
    File bonanza = new File("outputs/bonanza");
    do {
      key = new Key(input.nextLine());
      isCracked = safe.crackSafe(key);
      try {
        FileWriter writer = new FileWriter(bonanza);
        writer.write(safe + "\n");
        writer.close();
      } catch (IOException err) {
      }
    } while (input.hasNext() && !isCracked);
  }
}