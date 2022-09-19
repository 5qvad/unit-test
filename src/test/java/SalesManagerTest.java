
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {

    @DisplayName("Тестируем максимум")
    @Test
    public void maxTest() {
        SalesManager salesManager = new SalesManager(new long[]{2, 4, 6, 3, 8, 4});
        Assertions.assertEquals(8, salesManager.max());

    }

    @DisplayName("Тестируем минимум")
    @Test
    public void minTest() {
        SalesManager salesManager = new SalesManager(new long[]{2, 4, 6, 3, 8, 4});
        Assertions.assertEquals(2, salesManager.min());
    }

    @DisplayName("Тестируем среднее")
    @Test
    public void averageCutTest() {
        SalesManager salesManager = new SalesManager(new long[]{2, 4, 6, 3, 8, 4});
        Assertions.assertEquals(4,salesManager.averageCut());
    }


}




