package assessmentTests;

import assessment.NumberToString;
import org.junit.Assert;
import org.junit.Test;

public class NumberToStringTest {
    NumberToString test = new NumberToString();

    @Test
    public void test1(){
        String expected = "Nine";
        String actual = test.convertNumber(9);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        String expected = "NinetyNine";
        String actual = test.convertNumber(99);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test3(){
        String expected = "NineHundredNinetyNine";
        String actual = test.convertNumber(999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test4(){
        String expected = "OneThousandNineHundredNinetyNine";
        String actual = test.convertNumber(1999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test5(){
        String expected = "NinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(99999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test6(){
        String expected = "NineHundredNinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(999999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test7(){
        String expected = "NineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(9999999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test8(){
        String expected = "NinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(99999999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test9(){
        String expected = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(999999999);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test10(){
        String expected = "OneBillionNineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actual = test.convertNumber(1999999999);
        Assert.assertEquals(expected,actual);
    }

}
