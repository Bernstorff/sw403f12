/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AWildcardPartOne extends PWildcardPartOne
{
    private PNcname _ncname_;
    private TColon _colon_;
    private TStar _star_;

    public AWildcardPartOne()
    {
        // Constructor
    }

    public AWildcardPartOne(
        @SuppressWarnings("hiding") PNcname _ncname_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") TStar _star_)
    {
        // Constructor
        setNcname(_ncname_);

        setColon(_colon_);

        setStar(_star_);

    }

    @Override
    public Object clone()
    {
        return new AWildcardPartOne(
            cloneNode(this._ncname_),
            cloneNode(this._colon_),
            cloneNode(this._star_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWildcardPartOne(this);
    }

    public PNcname getNcname()
    {
        return this._ncname_;
    }

    public void setNcname(PNcname node)
    {
        if(this._ncname_ != null)
        {
            this._ncname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ncname_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public TStar getStar()
    {
        return this._star_;
    }

    public void setStar(TStar node)
    {
        if(this._star_ != null)
        {
            this._star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._star_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ncname_)
            + toString(this._colon_)
            + toString(this._star_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ncname_ == child)
        {
            this._ncname_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._star_ == child)
        {
            this._star_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ncname_ == oldChild)
        {
            setNcname((PNcname) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
