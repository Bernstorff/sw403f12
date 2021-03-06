/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AExprPart extends PExprPart
{
    private TComma _comma_;
    private PExprsingle _exprsingle_;

    public AExprPart()
    {
        // Constructor
    }

    public AExprPart(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PExprsingle _exprsingle_)
    {
        // Constructor
        setComma(_comma_);

        setExprsingle(_exprsingle_);

    }

    @Override
    public Object clone()
    {
        return new AExprPart(
            cloneNode(this._comma_),
            cloneNode(this._exprsingle_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprPart(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PExprsingle getExprsingle()
    {
        return this._exprsingle_;
    }

    public void setExprsingle(PExprsingle node)
    {
        if(this._exprsingle_ != null)
        {
            this._exprsingle_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprsingle_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._exprsingle_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._exprsingle_ == child)
        {
            this._exprsingle_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._exprsingle_ == oldChild)
        {
            setExprsingle((PExprsingle) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
