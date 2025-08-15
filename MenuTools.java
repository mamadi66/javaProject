package upmc.game;

import java.util.Optional;

public class MenuTools {
  public Optional<Integer> parseMenuChoice(String choice) {
    try {
      Integer parsedChoice = Integer.valueOf(choice);
      return Optional.of(parsedChoice);
    }
    catch (NumberFormatException e) {
      return Optional.empty();
    }
  }
  
  public boolean verifyMenuChoice(Integer menu, int maxEntries) {
    return menu > 0 && menu < maxEntries;
  }
  
  public void verifyMenuChoiceException(Integer menu, int maxEntries) {
    if (!verifyMenuChoice(menu, maxEntries)) {
      throw new BadMenuChoiceException();
    }
  }
}
