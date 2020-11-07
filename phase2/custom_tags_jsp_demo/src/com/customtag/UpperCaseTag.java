package com.customtag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport{

	private String option;
	public void setOption(String option) {
		this.option = option;
	}
	@Override
	public void doTag() {
		JspWriter out=getJspContext().getOut();
		StringWriter sw=new StringWriter();
		try {
			getJspBody().invoke(sw);
			if(option==null || option.equalsIgnoreCase("upper")) {
			out.print(sw.toString().toUpperCase());
			}else {
				out.print(sw.toString().toLowerCase());
			}
		} catch (JspException | IOException e) {
			System.out.println(e);
		}
	}
}
