package com.johnbryce.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComposedBean {
	
	@Autowired
	private SingletoneBean mySingletoneBean;
	
	@Autowired
//	@Qualifier("prototypeBean")
	private PrototypeBean myPrototypeBean;
	
	@Autowired
	@Qualifier("protoSix")
	private PrototypeBean myProtoSix;
	
	public ComposedBean() {
		System.out.println("CTOR ComposedBean in action");
	}

	public SingletoneBean getMySingletoneBean() {
		return mySingletoneBean;
	}

	public void setMySingletoneBean(SingletoneBean mySingletoneBean) {
		this.mySingletoneBean = mySingletoneBean;
	}

	public PrototypeBean getMyPrototypeBean() {
		return myPrototypeBean;
	}

	public void setMyPrototypeBean(PrototypeBean myPrototypeBean) {
		this.myPrototypeBean = myPrototypeBean;
	}

	public PrototypeBean getMyProtoSix() {
		return myProtoSix;
	}

	public void setMyProtoSix(PrototypeBean myProtoSix) {
		this.myProtoSix = myProtoSix;
	}
	
	
	

}
