/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AAbbrevforwardstep extends PAbbrevforwardstep
{
    private TAbbrevAttrib _abbrevAttrib_;
    private PNodetest _nodetest_;

    public AAbbrevforwardstep()
    {
        // Constructor
    }

    public AAbbrevforwardstep(
        @SuppressWarnings("hiding") TAbbrevAttrib _abbrevAttrib_,
        @SuppressWarnings("hiding") PNodetest _nodetest_)
    {
        // Constructor
        setAbbrevAttrib(_abbrevAttrib_);

        setNodetest(_nodetest_);

    }

    @Override
    public Object clone()
    {
        return new AAbbrevforwardstep(
            cloneNode(this._abbrevAttrib_),
            cloneNode(this._nodetest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAbbrevforwardstep(this);
    }

    public TAbbrevAttrib getAbbrevAttrib()
    {
        return this._abbrevAttrib_;
    }

    public void setAbbrevAttrib(TAbbrevAttrib node)
    {
        if(this._abbrevAttrib_ != null)
        {
            this._abbrevAttrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abbrevAttrib_ = node;
    }

    public PNodetest getNodetest()
    {
        return this._nodetest_;
    }

    public void setNodetest(PNodetest node)
    {
        if(this._nodetest_ != null)
        {
            this._nodetest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nodetest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._abbrevAttrib_)
            + toString(this._nodetest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._abbrevAttrib_ == child)
        {
            this._abbrevAttrib_ = null;
            return;
        }

        if(this._nodetest_ == child)
        {
            this._nodetest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._abbrevAttrib_ == oldChild)
        {
            setAbbrevAttrib((TAbbrevAttrib) newChild);
            return;
        }

        if(this._nodetest_ == oldChild)
        {
            setNodetest((PNodetest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}