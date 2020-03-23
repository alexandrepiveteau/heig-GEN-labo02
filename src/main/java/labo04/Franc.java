package labo04;

public class Franc {

  private int amount;

  public Franc(int amount) {
    this.amount = amount;
  }

  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  public boolean equals(Object other) {
    Franc Franc = (Franc) other;
    return amount == Franc.amount;
  }

}
