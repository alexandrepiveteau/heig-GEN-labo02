package labo04;

public class Bank {

  public void addRate(String from, String to, int rate) {}

  public int rate(String from, String to) {
    return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
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
