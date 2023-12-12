package menu.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static menu.enums.ViewMessage.INPUT_COACH_HATE_MENUS;
import static menu.enums.ViewMessage.INPUT_COACH_NAMES;

public class InputView {
    private static final String SPLIT_DELIMITER = ",";
    public List<String> readCoachNames() {
        System.out.println(INPUT_COACH_NAMES.getMessage());
        return Arrays.stream(Console.readLine().strip().split(SPLIT_DELIMITER))
                .toList();
    }

    public List<String> readHateMenus(String name) {
        System.out.printf(INPUT_COACH_HATE_MENUS.getMessage(), name);
        return Arrays.stream(Console.readLine().strip().split(SPLIT_DELIMITER))
                .toList();
    }
}