public class Menu {
    private int menuID;
    private String title;
    private String description;
    private List<MenuSection> menuSections;
  
    public boolean addMenuSection(MenuSection menuSection);
    public boolean print();
  }