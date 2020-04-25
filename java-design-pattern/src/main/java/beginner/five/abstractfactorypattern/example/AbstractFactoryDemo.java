package beginner.five.abstractfactorypattern.example;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

    CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
    //here the end user will never come to know the business logic value of 650


    System.out.println(card.getClass());

    abstractFactory = CreditCardFactory.getCreditCardFactory(600);

    CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);
    System.out.println(card1.getClass());
  }

}
