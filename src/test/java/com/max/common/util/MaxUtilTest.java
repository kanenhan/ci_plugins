package com.max.common.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author:hanmanyi
 * @time:Jul 28, 2014 2:09:25 PM
 */
public class MaxUtilTest {

	@Test
	public void testSayHello(){
		String name = "Han Manyi";
		String answer = MaxUtil.sayHello(name);
		
		Assert.assertEquals("test_PrintHello failed",name + ", Hello!",answer);
	}
}
