/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AEverySomeEveryPart extends PSomeEveryPart
{
    private TKeywordEvery _keywordEvery_;

    public AEverySomeEveryPart()
    {
        // Constructor
    }

    public AEverySomeEveryPart(
        @SuppressWarnings("hiding") TKeywordEvery _keywordEvery_)
    {
        // Constructor
        setKeywordEvery(_keywordEvery_);

    }

    @Override
    public Object clone()
    {
        return new AEverySomeEveryPart(
            cloneNode(this._keywordEvery_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEverySomeEveryPart(this);
    }

    public TKeywordEvery getKeywordEvery()
    {
        return this._keywordEvery_;
    }

    public void setKeywordEvery(TKeywordEvery node)
    {
        if(this._keywordEvery_ != null)
        {
            this._keywordEvery_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordEvery_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordEvery_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordEvery_ == child)
        {
            this._keywordEvery_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordEvery_ == oldChild)
        {
            setKeywordEvery((TKeywordEvery) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
