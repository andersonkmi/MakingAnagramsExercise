package org.techstuff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by andersonkmi on 1/15/2017.
 */
public class MakingAnagramsTest {
    private MakingAnagrams service;

    @Before
    public void setUp() {
        service = new MakingAnagrams();
    }

    @Test
    public void testWithBothArgumentsNull() {
        assertThat(service.numberNeeded(null, null), is(0));
    }

    @Test
    public void testWithFirstArgumentNull() {
        assertThat(service.numberNeeded(null, "foo"), is(3));
    }

    @Test
    public void testWithFirstArgumentEmpty() {
        assertThat(service.numberNeeded("", "foo"), is(3));
    }

    @Test
    public void testWithSecondArgumentNull() {
        assertThat(service.numberNeeded("foo", null), is(3));
    }

    @Test
    public void testWithSecondArgumentEmpty() {
        assertThat(service.numberNeeded("foo", ""), is(3));
    }
}
