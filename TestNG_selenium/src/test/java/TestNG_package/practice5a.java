package TestNG_package;

import org.testng.annotations.Test;

public class practice5a {
    @Test
    public void testA() throws InterruptedException {
        System.out.println("TestA running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }

    @Test
    public void testB() throws InterruptedException {
        System.out.println("TestB running on thread: " + Thread.currentThread().getId());
        Thread.sleep(2000);
    }
}

