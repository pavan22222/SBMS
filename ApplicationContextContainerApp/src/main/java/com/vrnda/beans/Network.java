package com.vrnda.beans;

/**
 * @author Pavan
 *
 */
public class Network {
	
	private String cableName;
	private Long length;
	
	public Network() {
		System.out.println("Network 0-Param Constructor");
		
	}
	
	public String getCableName() {
		return cableName;
	}
	public void setCableName(String cableName) {
		this.cableName = cableName;
	}
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Network [cableName=" + cableName + ", length=" + length + "]";
	}
	
	
	
}
