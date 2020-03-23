package labo04;

public class Franc extends Money {

  public Franc(int amount) {
    this.amount = amount;
  }

  @Override
  String currency() {
    return "CHF";
  }

  public Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
