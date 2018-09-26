package com.asevue.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

public class HelloWorldTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH) + 1;

        if(timeOfDay >= 0 && timeOfDay < 12){
            out.println("Good Morning");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            out.println("Good Afternoon");
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            out.println("Good Evening");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            out.println("Good Night");
        }

        out.println("Day of month: " + dayOfMonth + ", Month: " + month);
        if(month == 2 && dayOfMonth == 2) {
            out.println("Happy groundhog day!!");
        }
    }
}
