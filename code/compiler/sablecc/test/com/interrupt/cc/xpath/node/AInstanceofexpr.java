/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AInstanceofexpr extends PInstanceofexpr
{
    private PTreatexpr _treatexpr_;
    private PInstanceofexprPart _instanceofexprPart_;

    public AInstanceofexpr()
    {
        // Constructor
    }

    public AInstanceofexpr(
        @SuppressWarnings("hiding") PTreatexpr _treatexpr_,
        @SuppressWarnings("hiding") PInstanceofexprPart _instanceofexprPart_)
    {
        // Constructor
        setTreatexpr(_treatexpr_);

        setInstanceofexprPart(_instanceofexprPart_);

    }

    @Override
    public Object clone()
    {
        return new AInstanceofexpr(
            cloneNode(this._treatexpr_),
            cloneNode(this._instanceofexprPart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstanceofexpr(this);
    }

    public PTreatexpr getTreatexpr()
    {
        return this._treatexpr_;
    }

    public void setTreatexpr(PTreatexpr node)
    {
        if(this._treatexpr_ != null)
        {
            this._treatexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._treatexpr_ = node;
    }

    public PInstanceofexprPart getInstanceofexprPart()
    {
        return this._instanceofexprPart_;
    }

    public void setInstanceofexprPart(PInstanceofexprPart node)
    {
        if(this._instanceofexprPart_ != null)
        {
            this._instanceofexprPart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instanceofexprPart_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._treatexpr_)
            + toString(this._instanceofexprPart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._treatexpr_ == child)
        {
            this._treatexpr_ = null;
            return;
        }

        if(this._instanceofexprPart_ == child)
        {
            this._instanceofexprPart_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._treatexpr_ == oldChild)
        {
            setTreatexpr((PTreatexpr) newChild);
            return;
        }

        if(this._instanceofexprPart_ == oldChild)
        {
            setInstanceofexprPart((PInstanceofexprPart) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
