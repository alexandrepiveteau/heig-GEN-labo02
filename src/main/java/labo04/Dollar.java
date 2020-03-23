package labo04;

public class Dollar {

  private int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object other) {
    Dollar dollar = (Dollar) other;
    return amount == dollar.amount;
  }

}
