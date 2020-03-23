package labo04;

public class Dollar extends Money {

  private String currency;

  public Dollar(int amount) {
    this.amount = amount;
    this.currency = "USD";
  }

  @Override
  String currency() {
    return currency;
  }

  public Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
