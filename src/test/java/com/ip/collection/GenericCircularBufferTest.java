package com.ip.collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GenericCircularBufferTest
{
    private GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<>(2);

    @Test
    public void shouldOfferPollableElement()
    {
        Assert.assertTrue(buffer.offer(1));

        Assert.assertEquals(Integer.valueOf(1), buffer.poll());
    }

    //@Test
    public void shouldNotOfferWhenBufferIsFull()
    {
        Assert.assertTrue(buffer.offer(1));
        Assert.assertTrue(buffer.offer(2));
        Assert.assertFalse(buffer.offer(3));
    }

   // @Test
    public void shouldNotPollWhenBufferIsEmpty()
    {
        Assert.assertNull(buffer.poll());
    }

    @Test
    public void shouldRecycleBuffer()
    {
        Assert.assertTrue(buffer.offer(1));
        Assert.assertTrue(buffer.offer(2));
        Assert.assertEquals(Integer.valueOf(1), buffer.poll());
        Assert.assertTrue(buffer.offer(3));
        Assert.assertEquals(Integer.valueOf(2), buffer.poll());
        Assert.assertEquals(Integer.valueOf(3), buffer.poll());
    }
}
