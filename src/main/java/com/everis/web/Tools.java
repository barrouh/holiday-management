package com.everis.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import liquibase.changelog.filter.ShouldRunChangeSetFilter;

public class Tools {
	
	private static final String[] IP_HEADER_CANDIDATES = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
			"HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP",
			"HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR" };

	public static String getClientIpAddr(HttpServletRequest request) {
		for (String header : IP_HEADER_CANDIDATES) {
			String ip = request.getHeader(header);
			if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
				return ip;
			}
		}
		return request.getRemoteAddr();
	}
	
	public static boolean isNotnull(String param) {
		if(param != null) {
			return !param.replaceAll("\\s+","").equals("");
		}else {
			return false;
		}
	}
	
	
	public static String dateFormater(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		return sdf.format(date);
	}
	
	public static String generatePassword(String text) {
	    
		text += "123456789";
		List<String> letters = Arrays.asList(text.split(""));
		  Collections.shuffle(letters);
		  String password = "";
		  for (String letter : letters) {
			  password += letter;
		  }
	    return password;
	}
	
	

}
