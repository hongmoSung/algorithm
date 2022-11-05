package programmers.lv0;

import java.util.Arrays;

/**
 * <p>머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.</p>
 * <p>머쓱이네 반 친구들의 키가 담긴 정수 배열 array 와 머쓱이의 키 height 가 매개변수로 주어질 때,</p>
 * <p>머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.</p>
 */
public class TallerPerson {

    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(p -> p > height).count();
    }
}
