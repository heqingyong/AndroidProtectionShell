package club.younge.shell;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefInvoke {
	/**
	 * ����ִ����ľ�̬����(public)
	 * 
	 * @param class_name
	 *            ����
	 * @param method_name
	 *            ������
	 * @param pareTyple
	 *            �����Ĳ�������
	 * @param pareVaules
	 *            ���ú���ʱ����Ĳ���
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object invokeStaticMethod(String class_name,
			String method_name, Class[] pareTyple, Object[] pareVaules) {

		try {
			Class obj_class = Class.forName(class_name);
			Method method = obj_class.getMethod(method_name, pareTyple);
			return method.invoke(null, pareVaules);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * ����ִ����ĺ�����public��
	 * 
	 * @param class_name
	 * @param method_name
	 * @param obj
	 * @param pareTyple
	 * @param pareVaules
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object invokeMethod(String class_name, String method_name,
			Object obj, Class[] pareTyple, Object[] pareVaules) {

		try {
			Class obj_class = Class.forName(class_name);
			Method method = obj_class.getMethod(method_name, pareTyple);
			return method.invoke(obj, pareVaules);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * ����õ�������ԣ�����˽�кͱ�����
	 * 
	 * @param class_name
	 * @param obj
	 * @param filedName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Object getFieldOjbect(String class_name, Object obj,
			String filedName) {
		try {
			Class obj_class = Class.forName(class_name);
			Field field = obj_class.getDeclaredField(filedName);
			field.setAccessible(true);
			return field.get(obj);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * ����õ���ľ�̬���ԣ�����˽�кͱ�����
	 * 
	 * @param class_name
	 * @param filedName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Object getStaticFieldOjbect(String class_name,
			String filedName) {

		try {
			Class obj_class = Class.forName(class_name);
			Field field = obj_class.getDeclaredField(filedName);
			field.setAccessible(true);
			return field.get(null);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * ����������ԣ�����˽�кͱ�����
	 * 
	 * @param classname
	 * @param filedName
	 * @param obj
	 * @param filedVaule
	 */
	@SuppressWarnings("rawtypes")
	public static void setFieldOjbect(String classname, String filedName,
			Object obj, Object filedVaule) {
		try {
			Class obj_class = Class.forName(classname);
			Field field = obj_class.getDeclaredField(filedName);
			field.setAccessible(true);
			field.set(obj, filedVaule);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ������ľ�̬���ԣ�����˽�кͱ�����
	 * 
	 * @param class_name
	 * @param filedName
	 * @param filedVaule
	 */
	@SuppressWarnings("rawtypes")
	public static void setStaticOjbect(String class_name, String filedName,
			Object filedVaule) {
		try {
			Class obj_class = Class.forName(class_name);
			Field field = obj_class.getDeclaredField(filedName);
			field.setAccessible(true);
			field.set(null, filedVaule);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
