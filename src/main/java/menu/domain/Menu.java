package menu.domain;

import menu.enums.Category;

import static menu.enums.ErrorMessage.INVALID_MENU_NAME;

public class Menu {
    private final String name;
    private final Category category;

    public Menu(String name) {
        Category category = Category.selectCategoryByMenu(name);
        validateCorrectCategory(category);
        this.name = name;
        this.category = category;
    }

    private void validateCorrectCategory(Category category) {
        if (category == Category.NONE) {
            throw new IllegalArgumentException(INVALID_MENU_NAME.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}