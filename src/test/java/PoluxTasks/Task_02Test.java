package PoluxTasks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task_02Test {

    @Test
    public void whenStringWithTheSameChars() {
        Task_02 task02 = new Task_02();
        String strOne = "sadap";
        String strTwo = "dsapa";
        boolean result = task02.isSame(strOne, strTwo);
        assertThat(result, is(true));
    }

    @Test
    public void whenStringWithDifferentChars() {
        Task_02 task02 = new Task_02();
        String strOne = "sadap";
        String strTwo = "ddsap";
        boolean result = task02.isSame(strOne, strTwo);
        assertThat(result, is(false));
    }

    @Test
    public void charsValuesSummerTest() {
        Task_02 task02 = new Task_02();
        String a = "a";
        int expected = 10;
        int result = task02.counterSummChars(a);
        assertThat(result, is(expected));
        String aaa = "aaa";
        expected = 30;
        result = task02.counterSummChars(aaa);
        assertThat(result, is(expected));
        String abc = "abc";
        expected = 33;
        result = task02.counterSummChars(abc);
        assertThat(result, is(expected));
    }
}