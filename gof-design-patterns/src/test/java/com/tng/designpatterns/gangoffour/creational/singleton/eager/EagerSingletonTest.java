package com.tng.designpatterns.gangoffour.creational.singleton.eager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonTest {

    @Test
    void testSingletonInstanceNotNull() {
        EagerSingleton instance = EagerSingleton.getInstance();
        assertNotNull(instance, "Singleton instance should not be null");
    }

    @Test
    void testSingletonSameInstance() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        assertSame(instance1, instance2, "Both references should point to the same instance");
    }

    @Test
    void testSingletonMethodOutput() {
        EagerSingleton instance = EagerSingleton.getInstance();
        String message = instance.showMessage();
        assertEquals("Hello from Eager Singleton!", message);
    }
}
