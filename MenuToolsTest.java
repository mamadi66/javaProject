package upmc.game;

import static org.junit.Assert.*;

import org.junit.*;

public class MenuToolsTest {

  private MenuTools tools;
  
  @Before
  public void createMenuTools() {
    tools = new MenuTools();
  }
  
  @Test
  public void testParseMenuChoice() {
    fail("Not yet implemented");
  }

  @Test
  public void testVerifyMenuChoice() {
    // Arrange
    int menu = 0;
    int maxEntries = 2;
    // Act
    boolean result = tools.verifyMenuChoice(menu, maxEntries);
    // Assert
    assertTrue(result);
  }
  
  @Test(expected=BadMenuChoiceException.class)
  public void testVerifyMenuChoiceException() {
    // Arrange
    int menu = 0;
    int maxEntries = 2;
    // Act
    tools.verifyMenuChoiceException(menu, maxEntries);
  }
}
