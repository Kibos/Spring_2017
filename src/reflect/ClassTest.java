package reflect;

import java.lang.reflect.Field;

public class ClassTest {

	   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException ,Exception {  
	        User user = new User();  
	        Class c1 = user.getClass();  
	        Class c2 = User.class;  
	        Class c3 = Class.forName("reflect.User");  
	        System.out.println(c1==c2);  
	        System.out.println(c2==c3);  
	        ///通过newInstance方法创建一个user实例对象，使用newInstance方法必须要有一个公共的构造方法  
	        user = (User)c3.newInstance();  
	        
	        System.out.println(" == "+user.getClass().getFields());;


	        user.setName("jeey");  
	        user.setAge(20);  
//	        Class c1= user.getClass();  
	        Field f = c1.getDeclaredField("name");  
	        //如下操作不能针对private属性，private只能通过get和set方法访问  
	        System.out.println("字段类型:"+f.getType().getName());  
	        System.out.println("字段值："+f.get(user));  
	        f.set(user, "jock");  
	        System.out.println("修改后的字段属性值:"+user.getName());  
	    }   



}
