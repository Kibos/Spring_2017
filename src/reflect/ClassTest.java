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
	        ///ͨ��newInstance��������һ��userʵ������ʹ��newInstance��������Ҫ��һ�������Ĺ��췽��  
	        user = (User)c3.newInstance();  
	        
	        System.out.println(" == "+user.getClass().getFields());;


	        user.setName("jeey");  
	        user.setAge(20);  
//	        Class c1= user.getClass();  
	        Field f = c1.getDeclaredField("name");  
	        //���²����������private���ԣ�privateֻ��ͨ��get��set��������  
	        System.out.println("�ֶ�����:"+f.getType().getName());  
	        System.out.println("�ֶ�ֵ��"+f.get(user));  
	        f.set(user, "jock");  
	        System.out.println("�޸ĺ���ֶ�����ֵ:"+user.getName());  
	    }   



}
