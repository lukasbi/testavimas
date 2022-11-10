package ivadas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testSumResultProvidingTwoAndTwo() {
        //1. Pateikiam duomenis
        int variableA = 2;
        int variableB = 2;
        int expectedResult = 4;
        int actualResult;

        //2. Atliekame testo veiksmus
        actualResult = variableA + variableB;

        //3. Palyginam rezultatus
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDifferenceResultProvidingMinusOneAndMinusTwo() {

        //1. Pateikiam duomenis
        int variableA = -1;
        int variableB = -2;
        int expectedResult = -3;
        int actualResult;

        //2. Atliekame testo veiksmus
        actualResult = variableA + variableB;

        //3. Palyginam rezultatus
        Assert.assertTrue(
                expectedResult == actualResult,
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
