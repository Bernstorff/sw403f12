/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AAndexprPart extends PAndexprPart
{
    private TKeywordAnd _keywordAnd_;
    private PComparisonexpr _comparisonexpr_;

    public AAndexprPart()
    {
        // Constructor
    }

    public AAndexprPart(
        @SuppressWarnings("hiding") TKeywordAnd _keywordAnd_,
        @SuppressWarnings("hiding") PComparisonexpr _comparisonexpr_)
    {
        // Constructor
        setKeywordAnd(_keywordAnd_);

        setComparisonexpr(_comparisonexpr_);

    }

    @Override
    public Object clone()
    {
        return new AAndexprPart(
            cloneNode(this._keywordAnd_),
            cloneNode(this._comparisonexpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndexprPart(this);
    }

    public TKeywordAnd getKeywordAnd()
    {
        return this._keywordAnd_;
    }

    public void setKeywordAnd(TKeywordAnd node)
    {
        if(this._keywordAnd_ != null)
        {
            this._keywordAnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordAnd_ = node;
    }

    public PComparisonexpr getComparisonexpr()
    {
        return this._comparisonexpr_;
    }

    public void setComparisonexpr(PComparisonexpr node)
    {
        if(this._comparisonexpr_ != null)
        {
            this._comparisonexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparisonexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordAnd_)
            + toString(this._comparisonexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordAnd_ == child)
        {
            this._keywordAnd_ = null;
            return;
        }

        if(this._comparisonexpr_ == child)
        {
            this._comparisonexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordAnd_ == oldChild)
        {
            setKeywordAnd((TKeywordAnd) newChild);
            return;
        }

        if(this._comparisonexpr_ == oldChild)
        {
            setComparisonexpr((PComparisonexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
