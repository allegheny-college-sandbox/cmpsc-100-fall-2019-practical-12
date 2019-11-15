package heist;

import java.util.Random;

/** Creates a Lock object.
 *
 * @author Douglas Luman
 */
public class Lock {
  
  private final String core;
  private Random keymaster = new Random();
  
  /** Constructor.
   *
   */
  public Lock() {
    int key = this.keymaster.nextInt(1000) + 1001;
    this.core = Integer.toString(key,16);
  }
  
  /** Picks the lock.
   *
   * @param key A key object
   */
  public boolean pick(Key key) {
    if (this.core.equals(key.core)) {
      return true;
    }
    return false;
  }
}