package com.foxlink.realtime.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QueryByIdList {
	private String EXCEPTION_DATE;
	private String COSTID;
	private String DEPID;
	private String SHIFT;
	private String USERID;
	private String USERNAME;
	private String EXCEPTION_INTERVAL;
	private String EXCEPTION_REASON;
	public String getEXCEPTION_DATE() {	
		return EXCEPTION_DATE;
	}
	public void setEXCEPTION_DATE(String eXCEPTION_DATE) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = null;
		//String str="2012-05-24 11:44:34";
		Date d;
		try {
			d = formatter.parse(eXCEPTION_DATE);
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			date = format.format(d);
			System.out.println("date==="+date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		EXCEPTION_DATE = date;
	}
	public String getCOSTID() {
		return COSTID;
	}
	public void setCOSTID(String cOSTID) {
		COSTID = cOSTID;
	}
	public String getDEPID() {
		return DEPID;
	}
	public void setDEPID(String dEPID) {
		DEPID = dEPID;
	}
	public String getSHIFT() {
		return SHIFT;
	}
	public void setSHIFT(String sHIFT) {
		SHIFT = sHIFT;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getEXCEPTION_INTERVAL() {
		return EXCEPTION_INTERVAL;
	}
	public void setEXCEPTION_INTERVAL(String eXCEPTION_INTERVAL) {
		EXCEPTION_INTERVAL = eXCEPTION_INTERVAL;
	}
	public String getEXCEPTION_REASON() {
		return EXCEPTION_REASON;
	}
	public void setEXCEPTION_REASON(String eXCEPTION_REASON) {
		EXCEPTION_REASON = eXCEPTION_REASON;
	}
	@Override
	public String toString() {
		return "QueryByIdList [EXCEPTION_DATE=" + EXCEPTION_DATE + ", COSTID=" + COSTID + ", DEPID=" + DEPID
				+ ", SHIFT=" + SHIFT + ", USERID=" + USERID + ", USERNAME=" + USERNAME + ", EXCEPTION_INTERVAL="
				+ EXCEPTION_INTERVAL + ", EXCEPTION_REASON=" + EXCEPTION_REASON + "]";
	}
	
}
