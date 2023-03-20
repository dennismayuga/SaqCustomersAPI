package ca.vanier;


import org.junit.Assert;
import org.junit.Test;

public class CustomerApiTest{

@Test (expected = Exception.class)
public void TestingExceptionWrongButSaveIsCorrect() throws Exception{
String[] args = new String[] {"Save", "x", "x", "wrong"};
CustomerManager.execute(args);
}

@Test (expected = Exception.class)
public void TestingExceptionWrongList() throws Exception{
String[] args = new String[] {"wrong"};
CustomerManager.execute(args);
}

@Test (expected = Exception.class)
public void TestingExceptionEmptyString() throws Exception{
String[] args = new String[] {};
CustomerManager.execute(args);
}

@Test
public void TestingListAll() throws Exception{
    String[] args = new String[] {"List"};
    boolean test = CustomerManager.execute(args);
    Assert.assertTrue(test);
}

@Test
public void TestingEightTeenAndOver() throws Exception{
    String[] args = new String[] {"Save","Cole","Caufield","18"};
    boolean test = CustomerManager.execute(args);
    Assert.assertTrue(test);
}

@Test
public void TestingEightTeenAndUnder() throws Exception{
    String[] args = new String[] {"Save","Colk","Caufield","17"};
    boolean test = CustomerManager.execute(args);
    Assert.assertFalse(test);
}


}