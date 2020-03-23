package labo04;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object other) {
    Money money = (Money) other;
    return amount == money.amount;
  }
}
