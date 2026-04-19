import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFine {

    @Test
    public void testFineCalculation() {
        IssueTransaction t = new IssueTransaction(1, 5);
        int result = t.calculateFine();
        assertEquals(25, result);
    }

    @Test
    public void testNoFine() {
        IssueTransaction t = new IssueTransaction(1, 0);
        int result = t.calculateFine();
        assertEquals(0, result);
    }
}