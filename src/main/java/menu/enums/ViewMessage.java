package menu.enums;

public enum ViewMessage {
    INPUT_COACH_NAMES("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_COACH_HATE_MENUS("%s(이)가 못 먹는 메뉴를 입력해 주세요.\n"),
    OUTPUT_SERVICE_START("점심 메뉴 추천을 시작합니다.\n"),
    OUTPUT_SERVICE_RESULT("메뉴 추천 결과입니다.\n" +
            "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]\n" +
            "[ 카테고리 | 한식 | 한식 | 일식 | 중식 | 아시안 ]"),
    OUTPUT_RECOMMEND_MENUS("[ %s | %s | %s | %s | %s | %s ]\n"),
    OUTPUT_SERVICE_END("\n추천을 완료했습니다.");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
