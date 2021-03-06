/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ATreatexprPart extends PTreatexprPart
{
    private TKeywordTreat _keywordTreat_;
    private TKeywordAs _keywordAs_;
    private PSequencetype _sequencetype_;

    public ATreatexprPart()
    {
        // Constructor
    }

    public ATreatexprPart(
        @SuppressWarnings("hiding") TKeywordTreat _keywordTreat_,
        @SuppressWarnings("hiding") TKeywordAs _keywordAs_,
        @SuppressWarnings("hiding") PSequencetype _sequencetype_)
    {
        // Constructor
        setKeywordTreat(_keywordTreat_);

        setKeywordAs(_keywordAs_);

        setSequencetype(_sequencetype_);

    }

    @Override
    public Object clone()
    {
        return new ATreatexprPart(
            cloneNode(this._keywordTreat_),
            cloneNode(this._keywordAs_),
            cloneNode(this._sequencetype_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATreatexprPart(this);
    }

    public TKeywordTreat getKeywordTreat()
    {
        return this._keywordTreat_;
    }

    public void setKeywordTreat(TKeywordTreat node)
    {
        if(this._keywordTreat_ != null)
        {
            this._keywordTreat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordTreat_ = node;
    }

    public TKeywordAs getKeywordAs()
    {
        return this._keywordAs_;
    }

    public void setKeywordAs(TKeywordAs node)
    {
        if(this._keywordAs_ != null)
        {
            this._keywordAs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._keywordAs_ = node;
    }

    public PSequencetype getSequencetype()
    {
        return this._sequencetype_;
    }

    public void setSequencetype(PSequencetype node)
    {
        if(this._sequencetype_ != null)
        {
            this._sequencetype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sequencetype_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._keywordTreat_)
            + toString(this._keywordAs_)
            + toString(this._sequencetype_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._keywordTreat_ == child)
        {
            this._keywordTreat_ = null;
            return;
        }

        if(this._keywordAs_ == child)
        {
            this._keywordAs_ = null;
            return;
        }

        if(this._sequencetype_ == child)
        {
            this._sequencetype_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._keywordTreat_ == oldChild)
        {
            setKeywordTreat((TKeywordTreat) newChild);
            return;
        }

        if(this._keywordAs_ == oldChild)
        {
            setKeywordAs((TKeywordAs) newChild);
            return;
        }

        if(this._sequencetype_ == oldChild)
        {
            setSequencetype((PSequencetype) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
