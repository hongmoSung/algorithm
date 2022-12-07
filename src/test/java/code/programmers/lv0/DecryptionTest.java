package code.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecryptionTest {

    private final Decryption decryption = new Decryption();

    /**
     * <table>
     *     <tr>
     *         <td>cipher</td>
     *         <td>code</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>"dfjardstddetckdaccccdegk"</td>
     *         <td>4</td>
     *         <td>"attack"</td>
     *     </tr>
     *     <tr>
     *         <td>"pfqallllabwaoclk"</td>
     *         <td>2</td>
     *         <td>"fallback"</td>
     *     </tr>
     * </table>
     */
    @Test
    void decryptionTest() {
        assertThat(decryption.solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
        assertThat(decryption.solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
    }

}