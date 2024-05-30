import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{
    private Date inputDate;
    private Date expectedDate;
    public DateNextDateOkTest(Date inputDate, Date expectedDate) {
        this.inputDate = inputDate;
        this.expectedDate = expectedDate;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Date(2024, 5, 3), new Date(2024, 5, 4)},
                {new Date(2024, 12, 24), new Date(2024, 12, 25)},
                {new Date(2024, 12, 31), new Date(2025, 1, 1)}
        });
    }

    @Test
    public void testNextDate() {
        Assert.assertEquals(expectedDate, inputDate.nextDate());
    }
}