package chow.zidane.ojs.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import chow.zidane.ojs.leetcode.converter.StringToBinaryTreeConverter;
import chow.zidane.ojs.leetcode.converter.StringToIntegerListsConverter;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

class BinaryTreeLevelTraversalFromBottomTest {

    @ParameterizedTest
    @CsvSource( {"'3,9,20,*,*,15,7','15,7|9,20|3'", "'*',''", "'3','3'", "'3,4,*,5,*,6,*','6|5|4|3'"})
    void test(
            @ConvertWith(StringToBinaryTreeConverter.class) TreeNode root,
            @ConvertWith(StringToIntegerListsConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, BinaryTreeLevelTraversalFromBottom.traversal(root));
    }

}
