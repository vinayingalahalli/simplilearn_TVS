package com.customtag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDate extends SimpleTagSupport{

	private String format;
	
	@Override
	public void doTag() {
		JspWriter out=getJspContext().getOut();
		try {
			out.print(new SimpleDateFormat(format).format(new Date()));
		} catch (IOException e) {
			System.out.println(e);
		}
	}


	public void setFormat(String format) {
		this.format = format;
	}
}