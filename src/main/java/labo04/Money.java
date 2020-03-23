package labo04;

public abstract class Money {
  protected int amount;

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  abstract Money times(int amount);

  public boolean equals(Object other) {
    Money money = (Money) other;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
