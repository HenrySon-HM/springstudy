package com.spring.ioc.injection;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.spring.ioc.injection.CollectionBeanClint;

public class CollectionBeanClint {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean= (CollectionBean)factory.getBean("collectionBean");
		Map<String, String> addressList = bean.getAddressList();
//		for (String address : addressList) {
//			System.out.println(address.toString());
//		}
		System.out.println(addressList.get("��浿"));
		factory.close();
	}
}
