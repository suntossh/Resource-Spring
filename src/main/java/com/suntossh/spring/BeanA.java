package com.suntossh.spring;

import  javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class BeanA {
	
	private AccessBeanName accessBean;

	public AccessBeanName getAccessBean() {
		return accessBean;
	}

	/*@Resource
	@MagicBean
	public void setUniqueSuntosshBeanName(AccessBeanName accessBean) {
		this.accessBean = accessBean;
	}*/
	
	@Autowired
	@Qualifier("uniqueSuntosshBeanName")
	public void setUniqueSuntosshBeanName(AccessBeanName accessBean) {
		this.accessBean = accessBean;
	}
	
	
}
