package commom;


/**
 *  java���ͣ�Class<T>,Class<?>)
 * @author Kibos
 *<T extends Collection>  ���Ʒ���
 * <T extends SomeClass & interface1 & interface2 & interface3> ��ӿ�����
 *<? extends Collection> <? super Double> ͨ�������
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
		System.out.println("T��ʵ�������ǣ� " + t.getClass().getName());
	}
	//���ͷ���
    public <T> void print(T x) {  
        System.out.println(x.getClass().getName());  
    }  
}
