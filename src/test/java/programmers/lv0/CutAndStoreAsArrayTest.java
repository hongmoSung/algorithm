package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CutAndStoreAsArrayTest {

    private final CutAndStoreAsArray cutAndStoreAsArray = new CutAndStoreAsArray();

    /**
     * <table>
     *     <tr>
     *         <td>my_str</td>
     *         <td>n</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"abc1Addfggg4556b"</td>
     *         <td>6</td>
     *         <td>["abc1Ad", "dfggg4", "556b"]</td>
     *     </tr>
     *     <tr>
     *         <td>"abcdef123"</td>
     *         <td>3</td>
     *         <td>["abc", "def", "123"]</td>
     *     </tr>
     * </table>
     */
    @Test
    void cutAndStoreAsArrayTest() {
        assertThat(cutAndStoreAsArray.solution("abc1Addfggg4556b", 6))
                .isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
        assertThat(cutAndStoreAsArray.solution("abcdef123", 3))
                .isEqualTo(new String[]{"abc", "def", "123"});
    }
}