package chow.zidane.ojs.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RegularExpressionMatchingTests {

    @ParameterizedTest
    @CsvSource( {"'',''", "a,.", "aa,a.", "tn,.n", "a.,..", "ab,.*", "a,a*", "aaa,a*", "aaab,a*b", "ab,a*b", "a.,..", "aa,.*", "aaa,a*a"})
    void testTrueCase(final String s, final String p) {
        assertTrue(RegularExpressionMatching.Recursive.match(s, p));
        assertTrue(RegularExpressionMatching.DynamicProgramming.match(s, p));
    }

    @ParameterizedTest
    @CsvSource( {"a,''", "aa,b.", "a,b", "au.,.ub", "a,b*", "aaj,a**", "a,ab"})
    void testFalseCase(final String s, final String p) {
        assertFalse(RegularExpressionMatching.Recursive.match(s, p));
        assertFalse(RegularExpressionMatching.DynamicProgramming.match(s, p));
    }

}
