/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ARangeexprPart extends PRangeexprPart
{
    private TKeywordTo _keywordTo_;
    private PAdditiveexpr _additiveexpr_;

    public ARangeexprPart()
    {
        // Constructor
    }

    public ARangeexprPart(
        @SuppressWarnings("hiding") TKeywordTo _keywordTo_,
        @SuppressWarnings("hiding") PAdditiveexpr _additiveexpr_)
    {
        // Constructor
        setKeywordTo(_keywordTo_);

        setAdditiveexpr(_additiveexpr_);

    }

    @Override
    public Object clone()
    {
        return new ARangeexprPart(
            cloneNode(this._keywordTo_),
            cloneNode(this._additiveexpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARangeexprPart(this);
    }

    public TKeywordTo getKeywordTo()
    {
        return this._keywordTo_;
    }

    public void setKeywordTo(TKeywordTo node)
    {
        if(this._keywordTo_ != null)
        {
            this._keywordTo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordTo_ = node;
    }

    public PAdditiveexpr getAdditiveexpr()
    {
        return this._additiveexpr_;
    }

    public void setAdditiveexpr(PAdditiveexpr node)
    {
        if(this._additiveexpr_ != null)
        {
            this._additiveexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._additiveexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordTo_)
            + toString(this._additiveexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordTo_ == child)
        {
            this._keywordTo_ = null;
            return;
        }

        if(this._additiveexpr_ == child)
        {
            this._additiveexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordTo_ == oldChild)
        {
            setKeywordTo((TKeywordTo) newChild);
            return;
        }

        if(this._additiveexpr_ == oldChild)
        {
            setAdditiveexpr((PAdditiveexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}