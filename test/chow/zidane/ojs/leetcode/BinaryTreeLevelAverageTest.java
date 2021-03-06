package chow.zidane.ojs.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import chow.zidane.ojs.leetcode.converters.ToBinaryTreeConverter;
import chow.zidane.ojs.leetcode.converters.ToDoubleArrayConverter;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

class BinaryTreeLevelAverageTest {

    @ParameterizedTest
    @CsvSource( {"'3,9,20,*,*,15,7','3,14.5,11'", "'3','3'","'3,2,*,3,*,4','3,2,3,4"})
    void test(
            @ConvertWith(ToBinaryTreeConverter.class) TreeNode root,
            @ConvertWith(ToDoubleArrayConverter.class) List<Double> expected) {
        assertIterableEquals(expected, BinaryTreeLevelAverage.calculate(root));
    }

}
