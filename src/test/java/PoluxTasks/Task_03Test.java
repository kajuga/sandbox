package PoluxTasks;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task_03Test {

    @Test
    public void whenStringHasSomeWhitespaces() {
        Task_03 task03 = new Task_03();
        String result = task03.whitespaseChanger("asdasdasaasda asdaada asdasdad asd");
        String expected = "asdasdasaasda%20 asdaada%20 asdasdad%20 asd";
        assertThat(result, is(expected));
    }

    @Test
    public void whenStringHasOnlyFiveWhitespaces() {
        Task_03 task03 = new Task_03();
        String result = task03.whitespaseChanger("     ");
        String expected = "%20 %20 %20 %20 %20 ";
        assertThat(result, is(expected));
    }

    @Test
    public void whenStringHasSomeWhitespacesForVarTwo() {
        Task_03 task03 = new Task_03();
        String result = task03.whitespaceChangerVarTwo("asdasdasaasda asdaada asdasdad asd");
        String expected = "asdasdasaasda%20 asdaada%20 asdasdad%20 asd";
        assertThat(result, is(expected));
    }

    @Test
    public void whenStringHasOnlyFiveWhitespacesForVarTwo() {
        Task_03 task03 = new Task_03();
        String result = task03.whitespaceChangerVarTwo("     ");
        String expected = "%20 %20 %20 %20 %20 ";
        assertThat(result, is(expected));
    }
}