package labo04;

import java.util.Hashtable;

public class Bank {

  private Hashtable<Pair, Integer> rates = new Hashtable<>();

  public void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }

  public int rate(String from, String to) {
    if (from.equals(to)) return 1;
    return rates.get(new Pair(from, to));
  }

  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  private class Pair {
    private String from;
    private String to;

    private Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public boolean equals(final Object other) {
      Pair pair = (Pair) other;
      return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
      return 0;
    }
  }
}
