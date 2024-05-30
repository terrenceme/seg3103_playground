import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    private Date inputDate;
    private Date expectedDate;
    public DateNextDateExceptionTest(Date inputDate, Date expectedDate) {
        this.inputDate = inputDate;
        this.expectedDate = expectedDate;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Date(2024, 5, 3), new Date(2024, 5, 2)},
                {new Date(2024, 12, 24), new Date(2024, 12, 26)},
                {new Date(2024, 12, 31), new Date(2024, 1, 1)}
        });
    }

    @Test
    public void testNextDate() {
        Assert.assertEquals(expectedDate, inputDate.nextDate());
    }
}