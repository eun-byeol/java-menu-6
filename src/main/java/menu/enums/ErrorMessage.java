package menu.enums;

public enum ErrorMessage {
    INVALID_COACHES_SIZE("코치는 최소 2명, 최대 5명으로 입력해야 합니다."),
    INVALID_COACH_NAME_LENGTH("코치 이름은 최소 2글자, 최대 4글자로 입력해야 합니다."),
    DUPLICATED_COACH_NAMES("코치 이름은 중복될 수 없습니다."),
    INVALID_HATE_MENU_SIZE("못 먹는 메뉴는 최대 2개까지 입력할 수 있습니다."),
    INVALID_MENU_NAME("유효하지 않은 메뉴명입니다. 다시 입력해 주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        String tag = "[ERROR] ";
        return tag + message;
    }
}