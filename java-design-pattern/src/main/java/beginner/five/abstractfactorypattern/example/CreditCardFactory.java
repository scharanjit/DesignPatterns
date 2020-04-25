package beginner.five.abstractfactorypattern.example;

public abstract class CreditCardFactory {

  public static CreditCardFactory getCreditCardFactory(int creditScore) {
    if (creditScore >650) {

      //parent class Credit card factory does not know which card
      //it is going to return
      return new AmexFactory();
    }else {
      return new VisaFactory();
    }

  }


  public abstract CreditCard getCreditCard(CardType cardType);

  public abstract Validator getValidator(CardType cardType);


}
