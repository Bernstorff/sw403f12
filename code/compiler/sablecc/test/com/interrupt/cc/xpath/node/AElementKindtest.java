/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AElementKindtest extends PKindtest
{
    private PElementtest _elementtest_;

    public AElementKindtest()
    {
        // Constructor
    }

    public AElementKindtest(
        @SuppressWarnings("hiding") PElementtest _elementtest_)
    {
        // Constructor
        setElementtest(_elementtest_);

    }

    @Override
    public Object clone()
    {
        return new AElementKindtest(
            cloneNode(this._elementtest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElementKindtest(this);
    }

    public PElementtest getElementtest()
    {
        return this._elementtest_;
    }

    public void setElementtest(PElementtest node)
    {
        if(this._elementtest_ != null)
        {
            this._elementtest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementtest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementtest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementtest_ == child)
        {
            this._elementtest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementtest_ == oldChild)
        {
            setElementtest((PElementtest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}