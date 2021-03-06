/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AReverseAxisstepPart extends PAxisstepPart
{
    private PReversestep _reversestep_;

    public AReverseAxisstepPart()
    {
        // Constructor
    }

    public AReverseAxisstepPart(
        @SuppressWarnings("hiding") PReversestep _reversestep_)
    {
        // Constructor
        setReversestep(_reversestep_);

    }

    @Override
    public Object clone()
    {
        return new AReverseAxisstepPart(
            cloneNode(this._reversestep_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReverseAxisstepPart(this);
    }

    public PReversestep getReversestep()
    {
        return this._reversestep_;
    }

    public void setReversestep(PReversestep node)
    {
        if(this._reversestep_ != null)
        {
            this._reversestep_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reversestep_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._reversestep_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._reversestep_ == child)
        {
            this._reversestep_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._reversestep_ == oldChild)
        {
            setReversestep((PReversestep) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
