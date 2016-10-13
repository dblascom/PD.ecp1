package es.upm.miw.pd.singleton.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class ReferencesFactoryTest {
    private ReferencesFactory factory;

    @Before
    public void before() {
        factory = new ReferencesFactory();
        factory.getReference("cero");
    }

    @Test
    public void testGetReferenceNew() {
        assertEquals(1, factory.getReference("uno"));
    }

    @Test
    public void testGetReference() {
        assertEquals(0, factory.getReference("cero"));
    }
    
    @Test
    public void testRemoveReference() {
        factory.removeReference("cero");
        assertEquals(1, factory.getReference("cero"));
    }
    @Test
    public void testReferencesFactoryIsSingleton() {
        assertSame(ReferencesFactory.getFactory(), ReferencesFactory.getFactory());
    }

    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(ReferencesFactory.getFactory());
    }

    @Test
    public void testReferencesFactory() {
        assertEquals(0, ReferencesFactory.getFactory().getReference("cero"));
        assertEquals(1, ReferencesFactory.getFactory().getReference("uno"));
        ReferencesFactory.getFactory().removeReference("cero");
        assertEquals(2, ReferencesFactory.getFactory().getReference("cero"));
    }
}
