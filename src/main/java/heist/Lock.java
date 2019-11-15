package heist;

import java.util.Random;

public class Lock {
  
  private final String core;
  private Random keymaster = new Random();
  
  public Lock() {
    int key = this.keymaster.nextInt(1000) + 1001;
    this.core = Integer.toString(key,16);
  }
  
  public boolean pick(Key key) {
    if(this.core.equals(key.core)) {
      return true;
    }
    return false;
  }
}