public class HumanFactory extends CreatorClassFactory {

  @Override
  public Character createTrait() {
    if (getRace().equals("human")) {
        return new Human();
    } else if (getRace().equals("animal")) {
      return new Animal();
    } else if (getRace().equals("alien")) {
      return new Alien();
    } else {
      return null;
    }
  };
}
