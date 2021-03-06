/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AReverse5Reverseaxis extends PReverseaxis
{
    private PReverseaxisPartFive _reverseaxisPartFive_;

    public AReverse5Reverseaxis()
    {
        // Constructor
    }

    public AReverse5Reverseaxis(
        @SuppressWarnings("hiding") PReverseaxisPartFive _reverseaxisPartFive_)
    {
        // Constructor
        setReverseaxisPartFive(_reverseaxisPartFive_);

    }

    @Override
    public Object clone()
    {
        return new AReverse5Reverseaxis(
            cloneNode(this._reverseaxisPartFive_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReverse5Reverseaxis(this);
    }

    public PReverseaxisPartFive getReverseaxisPartFive()
    {
        return this._reverseaxisPartFive_;
    }

    public void setReverseaxisPartFive(PReverseaxisPartFive node)
    {
        if(this._reverseaxisPartFive_ != null)
        {
            this._reverseaxisPartFive_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reverseaxisPartFive_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._reverseaxisPartFive_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._reverseaxisPartFive_ == child)
        {
            this._reverseaxisPartFive_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._reverseaxisPartFive_ == oldChild)
        {
            setReverseaxisPartFive((PReverseaxisPartFive) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
