package menu.controller;

import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.Menu;
import menu.view.InputView;

import java.util.List;
import java.util.stream.Collectors;


public class MenuController {
    private final InputView inputView = new InputView();
    public void run() {
        Coaches coaches = initCoaches();
    }

    private Coaches initCoaches() {
        Coaches coaches = getNames();
        for (Coach coach : coaches.getCoaches()) {
            getHateMenus(coach);
        }
        return coaches;
    }

    private void getHateMenus(Coach coach) {
        while (true) {
            try {
                coach.initHateMenus();
                inputView.readHateMenus(coach.getName())
                        .forEach(coach::addHateMenu);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Coaches getNames() {
        while (true) {
            try {
                List<Coach> coaches = inputView.readCoachNames()
                                            .stream()
                                            .map(Coach::new)
                                            .collect(Collectors.toList());
                return new Coaches(coaches);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}