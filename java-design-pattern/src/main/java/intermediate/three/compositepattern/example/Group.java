package intermediate.three.compositepattern.example;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
  private List<Component> components = new ArrayList<>();

  public void add(Component shape) {
    components.add(shape);
  }

  public void render() {
    for (Component component : components)
      component.render();
  }

  @Override
  public void move() {
    for (Component component : components)
      component.move();
  }
}
