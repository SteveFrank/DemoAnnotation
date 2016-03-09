package cn.itcast.annotation3;

/**
 * 注释的赋值作用
 * @author 杨谦
 * @date 2015-11-9
 *
 */
@MyAnno1(
		a = 100,
		b = "hello",
		c = MyEnum1.A,
		d = String.class,
		e = @MyAnno2(aa = 200, bb = "world"),
		f = {"123","admin","123"}
)

public class demo3 {
	
}

@interface MyAnno1 {
	int a();
	String b();
	
	MyEnum1 c();
	Class d();
	
	MyAnno2 e();
	String[] f();
}

@interface MyAnno2 {
	int aa();
	String bb();
}

enum MyEnum1 {
	A , B , C
}