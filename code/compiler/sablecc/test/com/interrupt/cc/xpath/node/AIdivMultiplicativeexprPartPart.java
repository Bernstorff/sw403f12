/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AIdivMultiplicativeexprPartPart extends PMultiplicativeexprPartPart
{
    private TKeywordIdiv _keywordIdiv_;

    public AIdivMultiplicativeexprPartPart()
    {
        // Constructor
    }

    public AIdivMultiplicativeexprPartPart(
        @SuppressWarnings("hiding") TKeywordIdiv _keywordIdiv_)
    {
        // Constructor
        setKeywordIdiv(_keywordIdiv_);

    }

    @Override
    public Object clone()
    {
        return new AIdivMultiplicativeexprPartPart(
            cloneNode(this._keywordIdiv_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdivMultiplicativeexprPartPart(this);
    }

    public TKeywordIdiv getKeywordIdiv()
    {
        return this._keywordIdiv_;
    }

    public void setKeywordIdiv(TKeywordIdiv node)
    {
        if(this._keywordIdiv_ != null)
        {
            this._keywordIdiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordIdiv_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordIdiv_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordIdiv_ == child)
        {
            this._keywordIdiv_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordIdiv_ == oldChild)
        {
            setKeywordIdiv((TKeywordIdiv) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
