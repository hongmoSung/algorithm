package programmers.lv0;

public class Protractor {

    /**
     * <p>각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.</p>
     * <p>각 angle 이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를</p>
     * <p>return 하도록 solution 함수를 완성해주세요.</p>
     * <ul>
     * <li>예각 : 0 < angle < 90</li>
     * <li>직각 : angle = 90</li>
     * <li>둔각 : 90 < angle < 180</li>
     * <li>평각 : angle = 180</li>
     * </ul>
     */
    public int solution(int angle) {
        if (angle < 0 || angle > 180) return 0;
        return angle > 90 ? over90(angle) : less90(angle);
    }

    private int less90(int angle) {
        return angle == 90 ? 2 : 1;
    }

    private int over90(int angle) {
        return angle == 180 ? 4 : 3;
    }

}
