/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AReverseaxisPartTwo extends PReverseaxisPartTwo
{
    private TAxisAncestor _axisAncestor_;
    private TAxisDelim _axisDelim_;

    public AReverseaxisPartTwo()
    {
        // Constructor
    }

    public AReverseaxisPartTwo(
        @SuppressWarnings("hiding") TAxisAncestor _axisAncestor_,
        @SuppressWarnings("hiding") TAxisDelim _axisDelim_)
    {
        // Constructor
        setAxisAncestor(_axisAncestor_);

        setAxisDelim(_axisDelim_);

    }

    @Override
    public Object clone()
    {
        return new AReverseaxisPartTwo(
            cloneNode(this._axisAncestor_),
            cloneNode(this._axisDelim_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReverseaxisPartTwo(this);
    }

    public TAxisAncestor getAxisAncestor()
    {
        return this._axisAncestor_;
    }

    public void setAxisAncestor(TAxisAncestor node)
    {
        if(this._axisAncestor_ != null)
        {
            this._axisAncestor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._axisAncestor_ = node;
    }

    public TAxisDelim getAxisDelim()
    {
        return this._axisDelim_;
    }

    public void setAxisDelim(TAxisDelim node)
    {
        if(this._axisDelim_ != null)
        {
            this._axisDelim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._axisDelim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._axisAncestor_)
            + toString(this._axisDelim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._axisAncestor_ == child)
        {
            this._axisAncestor_ = null;
            return;
        }

        if(this._axisDelim_ == child)
        {
            this._axisDelim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._axisAncestor_ == oldChild)
        {
            setAxisAncestor((TAxisAncestor) newChild);
            return;
        }

        if(this._axisDelim_ == oldChild)
        {
            setAxisDelim((TAxisDelim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
