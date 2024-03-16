package me.barsopia.ami.algo;

import org.junit.Assert;
import org.junit.Test;

public class OOPSTest {

    @Test
    public void testOOPS() {
      parent p=new parent();
      p.printData();
      parent p1=new child();
      p1.printData();
      child c=new child();
      c.printData();
    //  child c1=new parent();
    //  c1.printData();
    }
}
