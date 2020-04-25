package beginner.five.abstractfactorypattern.example;

public class VisaValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }
}
