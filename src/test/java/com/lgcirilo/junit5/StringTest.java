package com.lgcirilo.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    // in JUnit5 methods need not to be public. They do however in JUnit4

    @BeforeEach
    public void before(TestInfo info) {
        System.out.println("running method" + info.getDisplayName());
    }

    @AfterEach
    public void after(TestInfo info) {
        System.out.println("done running method" + info.getDisplayName());
    }

    @BeforeAll
//    method must be static
    static public void beforeAll() {
        System.out.println("running once before all tests");
    }

    //    method must be static
    @AfterAll
    static public void afterAll() {
        System.out.println("running once after all tests");
    }

    @Test
    @DisplayName("Showing assertEquals usage")
    public void length_basic() {
        String str = "ABCD";
        int actualLength = str.length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @DisplayName("Showing assertThrows usage")
    public void length_exception() {
        String str = null;
        assertThrows(NullPointerException.class,
                () -> {str.length();}
                );
    }

    @Test
    @DisplayName("Showing assertNotNull and assertNull usage")
    public void toUpperCaseTest() {
        String str = "abcd";
        String result = str.toUpperCase();
        assertNotNull(result);
        //assertNull(result);
        assertEquals("ABCD", result);
    }

    @Test
    @DisplayName("Showing assertFalse and assertTrue usage")
    public void contains_basic() {
        String str = "abcdefgh";
        boolean result = str.contains("ijk");
        assertFalse(result);
//        assertTrue(result);
    }

    @Test
    @DisplayName("Showing assertArrayEquals usage")
    public void split_basic() {
        String str = "abc def ghi";
        String[] actualResult = str.split(" ");
        String[] expectedResult = {"abc", "def", "ghi"};
        assertArrayEquals(expectedResult, actualResult);
    }

}
