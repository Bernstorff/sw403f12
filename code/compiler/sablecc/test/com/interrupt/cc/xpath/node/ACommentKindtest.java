/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ACommentKindtest extends PKindtest
{
    private PCommenttest _commenttest_;

    public ACommentKindtest()
    {
        // Constructor
    }

    public ACommentKindtest(
        @SuppressWarnings("hiding") PCommenttest _commenttest_)
    {
        // Constructor
        setCommenttest(_commenttest_);

    }

    @Override
    public Object clone()
    {
        return new ACommentKindtest(
            cloneNode(this._commenttest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommentKindtest(this);
    }

    public PCommenttest getCommenttest()
    {
        return this._commenttest_;
    }

    public void setCommenttest(PCommenttest node)
    {
        if(this._commenttest_ != null)
        {
            this._commenttest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._commenttest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._commenttest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._commenttest_ == child)
        {
            this._commenttest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._commenttest_ == oldChild)
        {
            setCommenttest((PCommenttest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}