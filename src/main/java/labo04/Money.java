package labo04;

public class Money implements Expression {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public String currency() {
    return currency;
  }

  public Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public boolean equals(Object other) {
    Money money = (Money) other;
    return amount == money.amount && currency().equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
