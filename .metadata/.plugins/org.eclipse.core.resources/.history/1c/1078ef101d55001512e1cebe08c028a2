package com.iitshare.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
/**
 *
 *TODO
 *
 * @author ZhangYQ 2012-8-18 下午10:34:40
 * @version V1.0
 */
public class CallIitShare {
    public static void main(String[] args) {
		try {
			Class<?> cl = Class.forName("com.iitshare.model.IitShare");
			Method m;
			try {
				m = cl.getMethod("getSiteInfo",String.class);
				try {
					System.out.println(m.invoke(null,"itblood"));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}