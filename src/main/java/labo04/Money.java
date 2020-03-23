package labo04;

public class Money {
  protected int amount;

  public static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  public boolean equals(Object other) {
    Money money = (Money) other;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
