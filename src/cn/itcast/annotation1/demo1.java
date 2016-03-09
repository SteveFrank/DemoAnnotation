package cn.itcast.annotation1;

@MyAnno1
public class demo1 {
	
	@MyAnno1
	private String name;
	
	@MyAnno1
	public demo1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return null;
	}
}

/**
 * 定义注解
 * 天下所有的注解都是Annotation的子类！
 * @author 杨谦
 * @date 2015-11-9
 *
 */
@interface MyAnno1 {
	
}


