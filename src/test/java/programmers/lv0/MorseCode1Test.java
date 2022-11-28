package programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MorseCode1Test {

    private final MorseCode1 morseCode1 = new MorseCode1();

    /**
     * <table>
     *     <tr>
     *         <td>letter</td>
     *         <td>result</td>
     *     </tr>
     *     <tr>
     *         <td>".... . .-.. .-.. ---"</td>
     *         <td>"hello"</td>
     *     </tr>
     *     <tr>
     *         <td>".--. -.-- - .... --- -."</td>
     *         <td>"python"</td>
     *     </tr>
     * </table>
     */
    @Test
    void morseCode1Test() {
        assertThat(morseCode1.solution(".... . .-.. .-.. ---")).isEqualTo("hello");
        assertThat(morseCode1.solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }

}