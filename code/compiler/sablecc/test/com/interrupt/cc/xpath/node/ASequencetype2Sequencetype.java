/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ASequencetype2Sequencetype extends PSequencetype
{
    private PSequencetypePartTwo _sequencetypePartTwo_;

    public ASequencetype2Sequencetype()
    {
        // Constructor
    }

    public ASequencetype2Sequencetype(
        @SuppressWarnings("hiding") PSequencetypePartTwo _sequencetypePartTwo_)
    {
        // Constructor
        setSequencetypePartTwo(_sequencetypePartTwo_);

    }

    @Override
    public Object clone()
    {
        return new ASequencetype2Sequencetype(
            cloneNode(this._sequencetypePartTwo_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASequencetype2Sequencetype(this);
    }

    public PSequencetypePartTwo getSequencetypePartTwo()
    {
        return this._sequencetypePartTwo_;
    }

    public void setSequencetypePartTwo(PSequencetypePartTwo node)
    {
        if(this._sequencetypePartTwo_ != null)
        {
            this._sequencetypePartTwo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sequencetypePartTwo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sequencetypePartTwo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sequencetypePartTwo_ == child)
        {
            this._sequencetypePartTwo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sequencetypePartTwo_ == oldChild)
        {
            setSequencetypePartTwo((PSequencetypePartTwo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
