package TestNG_package;

import org.testng.annotations.Test;

public class practice5b {
    @Test
    public void testC() throws InterruptedException {
        System.out.println("TestC running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }

    @Test
    public void testD() throws InterruptedException {
        System.out.println("TestD running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }
}
