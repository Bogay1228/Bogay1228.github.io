package com.example.demo;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XmlParse {
		
	public static String getCtfATxnIdCode(String xmlToString) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if("CTF_A_TXN_ID_CODE".equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getIndi03(String xmlToString) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if("INDI03".equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getFRIST_NUMBER(String xmlToString) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if("FRIST_NUMBER".equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getCTF_ID_CODE(String xmlToString) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if("CTF_ID_CODE".equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static String getCTF_BIRTHDAY(String xmlToString) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if("CTF_BIRTHDAY".equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	/*
	 *  param :輸入要的欄位
	 * */
	public static String getColumnByParam(String xmlToString,String param) {
		String value = null;
		try {
			Document docment = DocumentHelper.parseText(xmlToString);
			Element roots = docment.getRootElement();
			for(Iterator<?> i = roots.elementIterator(); i.hasNext();) {
				Element root=(Element) i.next();
				for(Iterator<?> j = root.elementIterator(); j.hasNext();) {
					Element node = (Element) j.next();
					if(param.equals(node.getName())) {
						 value = node.getText();
						 break;
					 }
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return value;
	}
}
