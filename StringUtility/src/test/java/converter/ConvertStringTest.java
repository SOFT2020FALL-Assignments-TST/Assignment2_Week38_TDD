package converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertStringTest {

    private String str;
    private Converter c;

    @BeforeEach
    public void setUp(){
        str = "aBc";
        c = new Converter();
    }

    @ParameterizedTest
    @MethodSource
    public void testReverseString(String input, String expected){
        //String expected = "cBa";
        String actual = c.convertReverse(input);
        assertEquals(expected,actual);
    }

    private static Stream<Arguments> testReverseString(){
        return Stream.of(
                Arguments.of("aBc", "cBa"),
                Arguments.of("morten", "netrom"),
                Arguments.of("test", "tset")
        );
    }

    @Test
    public void testCapitalizeString(){
        String expected = "ABC";
        String actual = c.convertCapitalize(str);
        assertEquals(expected,actual);
    }

    @Test
    public void testLowercaseString(){
        String expected = "abc";
        String actual = c.convertLowercase(str);
        assertEquals(expected,actual);
    }

}
