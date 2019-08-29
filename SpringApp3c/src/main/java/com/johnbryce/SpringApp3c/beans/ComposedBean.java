package com.johnbryce.SpringApp3c.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class ComposedBean {
	
	@Autowired
	@Qualifier("prototypeBean")
	private PrototypeBean myPrototypeBean;
	
	@Autowired
	private SingletonBean mySingletonBean;
	
	@Autowired
	@Qualifier("protoSix")
	private PrototypeBean myProtoSix;

	public PrototypeBean getMyPrototypeBean() {
		return myPrototypeBean;
	}
	
	

	

//@Component
//public class ComposedBean {
//	
//	@Autowired
//	@Qualifier("prototypeBean")
//	private PrototypeBean myPrototypeBean;
//	
//	@Autowired
//	private SingletonBean mySingletonBean;
//	
//	@Autowired
//	@Qualifier("protoSix")
//	private PrototypeBean myProtoSix;
//
//	public PrototypeBean getMyPrototypeBean() {
//		return myPrototypeBean;
//	}
//	
//	
//
//	public ComposedBean() {
//		System.out.println("ComposedBean CTOR in action");
//	}
//
//
//
//	public void setMyPrototypeBean(PrototypeBean myPrototypeBean) {
//		this.myPrototypeBean = myPrototypeBean;
//	}
//
//	public SingletonBean getMySingletonBean() {
//		return mySingletonBean;
//	}
//
//	public void setMySingletonBean(SingletonBean mySingletonBean) {
//		this.mySingletonBean = mySingletonBean;
//	}
//
//	public PrototypeBean getMyProtoSix() {
//		return myProtoSix;
//	}
//
//	public void setMyProtoSix(PrototypeBean myProtoSix) {
//		this.myProtoSix = myProtoSix;
//	}
	
	

}
