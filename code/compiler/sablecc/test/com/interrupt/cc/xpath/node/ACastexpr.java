/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ACastexpr extends PCastexpr
{
    private PUnaryexpr _unaryexpr_;
    private PCastexprPart _castexprPart_;

    public ACastexpr()
    {
        // Constructor
    }

    public ACastexpr(
        @SuppressWarnings("hiding") PUnaryexpr _unaryexpr_,
        @SuppressWarnings("hiding") PCastexprPart _castexprPart_)
    {
        // Constructor
        setUnaryexpr(_unaryexpr_);

        setCastexprPart(_castexprPart_);

    }

    @Override
    public Object clone()
    {
        return new ACastexpr(
            cloneNode(this._unaryexpr_),
            cloneNode(this._castexprPart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACastexpr(this);
    }

    public PUnaryexpr getUnaryexpr()
    {
        return this._unaryexpr_;
    }

    public void setUnaryexpr(PUnaryexpr node)
    {
        if(this._unaryexpr_ != null)
        {
            this._unaryexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unaryexpr_ = node;
    }

    public PCastexprPart getCastexprPart()
    {
        return this._castexprPart_;
    }

    public void setCastexprPart(PCastexprPart node)
    {
        if(this._castexprPart_ != null)
        {
            this._castexprPart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._castexprPart_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unaryexpr_)
            + toString(this._castexprPart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unaryexpr_ == child)
        {
            this._unaryexpr_ = null;
            return;
        }

        if(this._castexprPart_ == child)
        {
            this._castexprPart_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unaryexpr_ == oldChild)
        {
            setUnaryexpr((PUnaryexpr) newChild);
            return;
        }

        if(this._castexprPart_ == oldChild)
        {
            setCastexprPart((PCastexprPart) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
