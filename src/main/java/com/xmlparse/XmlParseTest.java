package com.xmlparse;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlParseTest {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		//reader.setEncoding("GB2312");//这里设置文件编码
		Document doc = null;
		try {
			doc = reader.read("10012.xml");
			Element el = doc.getRootElement();
			Iterator it = el.elementIterator("head");
			while (it.hasNext()) {
				Element ele = (Element) it.next();
				// System.out.println(ele.elementTextTrim("standard_version_code"));
				List<Element> eles = ele.elements();
				sysOut(eles);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	public static void sysOut(List<Element> eles) {
		for (Element e : eles) {
			if(e.elements()==null || e.elements().size()==0) {
				System.out.println("属性名： " + e.getName() + "   值： " + e.getStringValue());
			}else {
				sysOut(e.elements());
			}
		}
	}
}
