/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ASingletype extends PSingletype
{
    private PAtomictype _atomictype_;
    private TQuestion _question_;

    public ASingletype()
    {
        // Constructor
    }

    public ASingletype(
        @SuppressWarnings("hiding") PAtomictype _atomictype_,
        @SuppressWarnings("hiding") TQuestion _question_)
    {
        // Constructor
        setAtomictype(_atomictype_);

        setQuestion(_question_);

    }

    @Override
    public Object clone()
    {
        return new ASingletype(
            cloneNode(this._atomictype_),
            cloneNode(this._question_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingletype(this);
    }

    public PAtomictype getAtomictype()
    {
        return this._atomictype_;
    }

    public void setAtomictype(PAtomictype node)
    {
        if(this._atomictype_ != null)
        {
            this._atomictype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atomictype_ = node;
    }

    public TQuestion getQuestion()
    {
        return this._question_;
    }

    public void setQuestion(TQuestion node)
    {
        if(this._question_ != null)
        {
            this._question_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._question_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atomictype_)
            + toString(this._question_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atomictype_ == child)
        {
            this._atomictype_ = null;
            return;
        }

        if(this._question_ == child)
        {
            this._question_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atomictype_ == oldChild)
        {
            setAtomictype((PAtomictype) newChild);
            return;
        }

        if(this._question_ == oldChild)
        {
            setQuestion((TQuestion) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}