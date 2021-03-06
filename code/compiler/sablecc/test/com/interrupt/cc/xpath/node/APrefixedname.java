/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class APrefixedname extends PPrefixedname
{
    private PPrefix _prefix_;
    private TColon _colon_;
    private PLocalpart _localpart_;

    public APrefixedname()
    {
        // Constructor
    }

    public APrefixedname(
        @SuppressWarnings("hiding") PPrefix _prefix_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PLocalpart _localpart_)
    {
        // Constructor
        setPrefix(_prefix_);

        setColon(_colon_);

        setLocalpart(_localpart_);

    }

    @Override
    public Object clone()
    {
        return new APrefixedname(
            cloneNode(this._prefix_),
            cloneNode(this._colon_),
            cloneNode(this._localpart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrefixedname(this);
    }

    public PPrefix getPrefix()
    {
        return this._prefix_;
    }

    public void setPrefix(PPrefix node)
    {
        if(this._prefix_ != null)
        {
            this._prefix_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prefix_ = node;
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

    public PLocalpart getLocalpart()
    {
        return this._localpart_;
    }

    public void setLocalpart(PLocalpart node)
    {
        if(this._localpart_ != null)
        {
            this._localpart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._localpart_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prefix_)
            + toString(this._colon_)
            + toString(this._localpart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prefix_ == child)
        {
            this._prefix_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._localpart_ == child)
        {
            this._localpart_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prefix_ == oldChild)
        {
            setPrefix((PPrefix) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._localpart_ == oldChild)
        {
            setLocalpart((PLocalpart) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
