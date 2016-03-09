package cn.itcast.annotation2;

@MyAnno1(age=100,name="admin")
@MyAnno2(name="admin",a={1,2})
@MyAnno3(100)
public class demo2 {
	
}


@interface MyAnno1 {
	/**
	 * 以下均称之为属性！！！切记！！！
	 * @return
	 */
	int age();
	String name();
}

/**
 * 在定义注解的时候可以指定默认值
 * @author 杨谦
 * @date 2015-11-9
 *
 */
@interface MyAnno2 {
	/**
	 * 以下均称之为属性！！！切记！！！
	 * 必须有括号！
	 * @return
	 */
	int age() default 100;
	String name();
	int[] a();
}

/**
 * 单独的值进行赋值的时候进行直接的赋值
 * @author 杨谦
 * @date 2015-11-9
 *
 */
@interface MyAnno3 {
	/**
	 * 当前的value就是所谓的特权属性
	 * @return
	 */
	int value();
	String name() default "wangWu";
}
