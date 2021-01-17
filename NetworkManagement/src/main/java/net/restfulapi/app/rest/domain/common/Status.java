package net.restfulapi.app.rest.domain.common;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "status")
public class Status {
	
	public static final Status ACTIVE = null;
	public static final Status INACTIVE = null;
	
	private String status;
	
	public Status() {
	    super();
	}
	
	public Status(String status) {
	    super();
	    this.status = status;
	}
}
