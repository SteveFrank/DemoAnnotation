package cn.itcast.annotation4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.w3c.dom.Element;

@MyAnno1
public class demo4 {
	
	@MyAnno1
	public void fun1() {
		
	}
}

@Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface MyAnno1 {
	/**
	 * ElementType.TYPE可以加到类上面
	 * ElementType.METHOD可以加到方法上面
	 * ElementType.FIELD可以加到限定域上
	 */
}
