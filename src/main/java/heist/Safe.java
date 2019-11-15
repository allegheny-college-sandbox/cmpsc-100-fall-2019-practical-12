package heist;

import java.util.Random;

public class Safe {

  public final Lock lock;
  private final int riches;
  private Random jackpot = new Random();
  private boolean cracked;

  public Safe() {
    this.lock = new Lock();
    this.riches = jackpot.nextInt(1000) + 1;
  }
  
  public boolean crackSafe(Key key) {
    if(this.lock.pick(key)) {
     this.cracked = true;
     return true;
    }
    this.cracked = false;
    return false;
  }
  
  public String toString() {
    String fortune = new String();
    if (this.cracked) {
      for (int i = 0; i < this.riches; i++) {
        fortune += "$";
      }
    } else {
      fortune = "Nice try.";
    }
    return fortune;
  }
}