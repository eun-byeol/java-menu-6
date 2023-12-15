package menu.domain;

import java.util.ArrayList;
import java.util.List;

import static menu.enums.ErrorMessage.INVALID_COACH_NAME_LENGTH;

public class Coach {
    private final String name;
    private List<Menu> hateMenus;

    public Coach(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() < 2 || name.length() > 4) {
            throw new IllegalArgumentException(INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

//    public void setHateMenus(List<Menu> hateMenus) {
//        this.hateMenus = hateMenus;
//    }

    public String getName() {
        return name;
    }
}