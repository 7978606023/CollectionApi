package com.ip.collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircularBufferTest
{
    private CircularBuffer buffer = new CircularBuffer(2);

    @Test
    public void shouldOfferPollableElement()
    {
        Assert.assertTrue(buffer.offer(1));

        Assert.assertEquals(1, buffer.poll());
        Assert.assertNull(buffer.poll());
    }

   // @Test
    public void shouldNotOfferWhenBufferIsFull()
    {
        Assert.assertTrue(buffer.offer(1));
        Assert.assertTrue(buffer.offer(2));
        Assert.assertFalse(buffer.offer(3));
    }

   // @Test
    public void shouldRecycleBuffer()
    {
        Assert.assertTrue(buffer.offer(1));
        Assert.assertTrue(buffer.offer(2));
        Assert.assertEquals(1, buffer.poll());
        Assert.assertTrue(buffer.offer(3));
        Assert.assertEquals(2, buffer.poll());
        Assert.assertEquals(3, buffer.poll());
    }
}
