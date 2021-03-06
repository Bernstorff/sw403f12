/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AElementtest extends PElementtest
{
    private TFnElement _fnElement_;
    private TLparenth _lparenth_;
    private PElementtestPart _elementtestPart_;
    private TRparenth _rparenth_;

    public AElementtest()
    {
        // Constructor
    }

    public AElementtest(
        @SuppressWarnings("hiding") TFnElement _fnElement_,
        @SuppressWarnings("hiding") TLparenth _lparenth_,
        @SuppressWarnings("hiding") PElementtestPart _elementtestPart_,
        @SuppressWarnings("hiding") TRparenth _rparenth_)
    {
        // Constructor
        setFnElement(_fnElement_);

        setLparenth(_lparenth_);

        setElementtestPart(_elementtestPart_);

        setRparenth(_rparenth_);

    }

    @Override
    public Object clone()
    {
        return new AElementtest(
            cloneNode(this._fnElement_),
            cloneNode(this._lparenth_),
            cloneNode(this._elementtestPart_),
            cloneNode(this._rparenth_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElementtest(this);
    }

    public TFnElement getFnElement()
    {
        return this._fnElement_;
    }

    public void setFnElement(TFnElement node)
    {
        if(this._fnElement_ != null)
        {
            this._fnElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fnElement_ = node;
    }

    public TLparenth getLparenth()
    {
        return this._lparenth_;
    }

    public void setLparenth(TLparenth node)
    {
        if(this._lparenth_ != null)
        {
            this._lparenth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparenth_ = node;
    }

    public PElementtestPart getElementtestPart()
    {
        return this._elementtestPart_;
    }

    public void setElementtestPart(PElementtestPart node)
    {
        if(this._elementtestPart_ != null)
        {
            this._elementtestPart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementtestPart_ = node;
    }

    public TRparenth getRparenth()
    {
        return this._rparenth_;
    }

    public void setRparenth(TRparenth node)
    {
        if(this._rparenth_ != null)
        {
            this._rparenth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparenth_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fnElement_)
            + toString(this._lparenth_)
            + toString(this._elementtestPart_)
            + toString(this._rparenth_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fnElement_ == child)
        {
            this._fnElement_ = null;
            return;
        }

        if(this._lparenth_ == child)
        {
            this._lparenth_ = null;
            return;
        }

        if(this._elementtestPart_ == child)
        {
            this._elementtestPart_ = null;
            return;
        }

        if(this._rparenth_ == child)
        {
            this._rparenth_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fnElement_ == oldChild)
        {
            setFnElement((TFnElement) newChild);
            return;
        }

        if(this._lparenth_ == oldChild)
        {
            setLparenth((TLparenth) newChild);
            return;
        }

        if(this._elementtestPart_ == oldChild)
        {
            setElementtestPart((PElementtestPart) newChild);
            return;
        }

        if(this._rparenth_ == oldChild)
        {
            setRparenth((TRparenth) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
