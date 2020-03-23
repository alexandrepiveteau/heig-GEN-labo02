package labo04;

public abstract class Money {
  protected int amount;
  protected String currency;

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount, null);
  }

  public String currency() {
    return currency;
  }

  abstract Money times(int amount);

  public boolean equals(Object other) {
    Money money = (Money) other;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
