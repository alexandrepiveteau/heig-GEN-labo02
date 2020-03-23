package labo04;

public class Money {
  protected int amount;
  protected String currency;

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public String currency() {
    return currency;
  }

  public Money plus(Money addend) {
    return new Money(amount + addend.amount, currency);
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
