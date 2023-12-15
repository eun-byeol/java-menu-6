package menu.domain;

import java.util.List;

import static menu.enums.ErrorMessage.DUPLICATED_COACH_NAMES;
import static menu.enums.ErrorMessage.INVALID_COACHES_SIZE;

public class Coaches {
    private final List<Coach> coaches;

    public Coaches(List<Coach> coaches) {
        validateSize(coaches);
        validateDuplicatedName(coaches);
        this.coaches = coaches;
    }

    private void validateSize(List<Coach> coaches) {
        if (coaches.size() < 2 || coaches.size() > 5) {
            throw new IllegalArgumentException(INVALID_COACHES_SIZE.getMessage());
        }
    }

    private void validateDuplicatedName(List<Coach> coaches) {
        if (coaches.size() != coaches.stream().map(Coach::getName).distinct().count()) {
            throw new IllegalArgumentException(DUPLICATED_COACH_NAMES.getMessage());
        }
    }

    public List<Coach> getCoaches() {
        return coaches;
    }
}
