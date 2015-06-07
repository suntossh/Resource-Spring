package com.suntossh.spring;

import org.springframework.beans.factory.BeanNameAware;

public class BeanC implements BeanNameAware, AccessBeanName {

	private String beanName;

	public String getBeanName() {
		return this.beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
