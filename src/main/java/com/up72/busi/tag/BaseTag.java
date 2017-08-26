package com.up72.busi.tag;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.jstl.core.LoopTag;
import javax.servlet.jsp.tagext.IterationTag;

public class BaseTag extends ForEachSupport
        implements LoopTag, IterationTag {

    /** 分页属性*/
    private boolean page = false;
    private int limit=10;

    /**jstl items标签*/
    protected Object items=null;

    public void setBegin(int begin) throws JspTagException {
        this.beginSpecified = true;
        this.begin = begin;
        validateBegin();
    }

    // for tag attribute
    public void setEnd(int end) throws JspTagException {
        this.endSpecified = true;
        this.end = end;
        validateEnd();
    }

    // for tag attribute
    public void setStep(int step) throws JspTagException {
        this.stepSpecified = true;
        this.step = step;
        validateStep();
    }

    public void setItems(Object o) throws JspTagException {
        items = o;
    }

    public void setVar(String id) {
        itemId = id;
    }

    public boolean isPage() {
        return page;
    }

    public void setPage(boolean page) {
        this.page = page;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
