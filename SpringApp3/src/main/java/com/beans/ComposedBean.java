package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComposedBean {
	
	@Autowired
	@Qualifier("prototypeBean")
	private PrototypeBean prototypeBean;
	
	@Autowired
	private SingletonBean singletonBean;
	
	@Autowired
	@Qualifier("protoSix")
	private PrototypeBean protoSix;
	
	
	

	public PrototypeBean getPrototypeBean() {
		return prototypeBean;
	}

	public void setPrototypeBean(PrototypeBean prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	public SingletonBean getSingletonBean() {
		return singletonBean;
	}

	public void setSingletonBean(SingletonBean singletonBean) {
		this.singletonBean = singletonBean;
	}

	public PrototypeBean getProtoSix() {
		return protoSix;
	}

	public void setProtoSix(PrototypeBean protoSix) {
		this.protoSix = protoSix;
	}

	@Override
	public String toString() {
		return "ComposedBean [prototypeBean=" + prototypeBean + ", singletonBean=" + singletonBean + ", protoSix="
				+ protoSix + "]";
	}

	
	
	

}
