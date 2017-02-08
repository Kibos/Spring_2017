package commom;


/**
 *  java泛型（Class<T>,Class<?>)
 * @author Kibos
 *<T extends Collection>  限制泛型
 * <T extends SomeClass & interface1 & interface2 & interface3> 多接口限制
 *<? extends Collection> <? super Double> 通配符泛型
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
