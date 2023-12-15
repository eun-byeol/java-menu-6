package menu.domain;

import java.util.ArrayList;
import java.util.List;

import static menu.enums.ErrorMessage.INVALID_COACH_NAME_LENGTH;
import static menu.enums.ErrorMessage.INVALID_HATE_MENU_SIZE;

public class Coach {
    private final String name;
    private final List<Menu> hateMenus;

    public Coach(String name) {
        validateNameLength(name);
        this.name = name;
        this.hateMenus = new ArrayList<>();
    }

    public void initHateMenus() {
        hateMenus.clear();
    }

    private void validateNameLength(String name) {
        if (name.length() < 2 || name.length() > 4) {
            throw new IllegalArgumentException(INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

    public void addHateMenu(String menuName) {
        if (!menuName.isEmpty()) {
            hateMenus.add(new Menu(menuName));
            validateHateMenuSize();
        }
    }

    private void validateHateMenuSize() {
        if (hateMenus.size() > 2) {
            throw new IllegalArgumentException(INVALID_HATE_MENU_SIZE.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", hateMenus=" + hateMenus +
                '}';
    }
}