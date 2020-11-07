package com.customtag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintDate  extends SimpleTagSupport{

	@Override
	public void doTag() {
		JspWriter out=getJspContext().getOut();
		try {
			out.print(new Date());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
