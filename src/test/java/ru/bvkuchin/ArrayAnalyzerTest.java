package ru.bvkuchin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArrayAnalyzerTest {

    ArrayAnalyzer arrayAnalyzer;

    @BeforeEach
    void onStart() {
        arrayAnalyzer = new ArrayAnalyzer();
    }

    @DisplayName("Параметризированный тест ")
    @ParameterizedTest
    @MethodSource("data")
    void paramTest(int[] expected, int[] initialArray) {
        Assertions.assertArrayEquals(expected, arrayAnalyzer.getResultedArray(initialArray));

    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.arguments(new int[]{5, 6}, new int[]{4, 1, 2, 3, 4, 5, 6}),
                Arguments.arguments(new int[]{5, 6 ,7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.arguments(new int[]{}, new int[]{1, 2, 3, 4}),
                Arguments.arguments(new int[]{}, new int[]{4, 5, 6, 4})
        );
    }

    @Test
    void exceptionTest() {
        Assertions.assertThrows(RuntimeException.class, () -> arrayAnalyzer.getResultedArray(new int[]{1, 2, 3, 5, 6, 7}));
    }


}