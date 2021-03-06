/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AValueexpr extends PValueexpr
{
    private PPathexpr _pathexpr_;

    public AValueexpr()
    {
        // Constructor
    }

    public AValueexpr(
        @SuppressWarnings("hiding") PPathexpr _pathexpr_)
    {
        // Constructor
        setPathexpr(_pathexpr_);

    }

    @Override
    public Object clone()
    {
        return new AValueexpr(
            cloneNode(this._pathexpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValueexpr(this);
    }

    public PPathexpr getPathexpr()
    {
        return this._pathexpr_;
    }

    public void setPathexpr(PPathexpr node)
    {
        if(this._pathexpr_ != null)
        {
            this._pathexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pathexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pathexpr_ == child)
        {
            this._pathexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pathexpr_ == oldChild)
        {
            setPathexpr((PPathexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
