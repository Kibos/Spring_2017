package commom;


/**
 *  java泛型（Class<T>,Class<?>)
 * @author Kibos
 *<T extends Collection>  限制泛型
 * <T extends SomeClass & interface1 & interface2 & interface3> 多接口限制
 *<? extends Collection> <? super Double> 通配符泛型
 *
 *  泛型是Java SE 1.5的新特性，泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。 Java语言引入泛型的好处是安全简单。
 * @param <T>
 */
public class GenericT<T> {

	public T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void showType() {
		System.out.println("T的实际类型是： " + t.getClass().getName());
	}
	//泛型方法
    public <T> void print(T x) {  
        System.out.println(x.getClass().getName());  
    }  
}
