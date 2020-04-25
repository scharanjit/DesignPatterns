package beginner.five.abstractfactorypattern.example;

public abstract class CreditCard {

  protected int cardNumberLength;

  protected  int cscLength;


  public int getCardNumberLength() {
    return cardNumberLength;
  }

  public void setCardNumberLength(int cardNumberLength) {
    this.cardNumberLength = cardNumberLength;
  }

  public int getCscLength() {
    return cscLength;
  }

  public void setCscLength(int cscLength) {
    this.cscLength = cscLength;
  }
}
