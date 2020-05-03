package nullInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClassForNullCheck {


  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("sds");
    names.add("adc");
    names.add("bdc");
    names.add("sde");

    OptionalClassForNullCheck optionalClassForNullCheck = new OptionalClassForNullCheck();

    System.out.println(optionalClassForNullCheck.pickLuckyNameWOrElse(names, "s"));
  }

  public String pickLuckyNameWOrElse(final List<String> names, final String startingLetter) {
    final Optional<String> luckyName = names.stream()
        .filter(name -> name.startsWith(startingLetter)).findFirst();
    return luckyName.orElse("No lucky name found");
  }

}
