/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ANameNodetest extends PNodetest
{
    private PNametest _nametest_;

    public ANameNodetest()
    {
        // Constructor
    }

    public ANameNodetest(
        @SuppressWarnings("hiding") PNametest _nametest_)
    {
        // Constructor
        setNametest(_nametest_);

    }

    @Override
    public Object clone()
    {
        return new ANameNodetest(
            cloneNode(this._nametest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANameNodetest(this);
    }

    public PNametest getNametest()
    {
        return this._nametest_;
    }

    public void setNametest(PNametest node)
    {
        if(this._nametest_ != null)
        {
            this._nametest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nametest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nametest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nametest_ == child)
        {
            this._nametest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nametest_ == oldChild)
        {
            setNametest((PNametest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}