package Test;


import UnitTesting.UnitTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {
    private UnitTask task;

    @BeforeEach
    void setUp() {
    this.task = new UnitTask();
    }
    @Test
    void filter1(){
        String origin = "ALL GROUP MEMBERS ATTEND IN THE LESSON";
        String expected = "ll grp mmbrs ttnd n th lssn";
        String actual = task.remVowel(origin);
        assertEquals(expected, actual);
    }
}
