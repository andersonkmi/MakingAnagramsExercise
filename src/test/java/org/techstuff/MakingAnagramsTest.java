package org.techstuff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

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
        Assert.assertThat(service.numberNeeded(null, null), is(0));
    }
}
