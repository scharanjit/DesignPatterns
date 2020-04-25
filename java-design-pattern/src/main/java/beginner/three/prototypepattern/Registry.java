package beginner.three.prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String,Item> itemMap = new HashMap<String, Item>();

  public Registry() {
    loadItems();
  }

  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item)(itemMap.get(type)).clone();

    }catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }


    return item;
  }

  private void loadItems() {

    Movie movie = new Movie();
    movie.setTitle("Basic Movie");
    movie.setRuntime("2 hours");
    movie.setPrice(24.99);
    itemMap.put("Movie",movie);

    Book book = new Book();
    book.setNumberOfPages(100);
    book.setPrice(12.21);
    book.setTitle("Basic Book");

    itemMap.put("Books", book);




  }

}
