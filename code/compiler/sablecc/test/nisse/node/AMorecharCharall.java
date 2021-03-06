/* This file was generated by SableCC (http://www.sablecc.org/). */

package nisse.node;

import nisse.analysis.*;

@SuppressWarnings("nls")
public final class AMorecharCharall extends PCharall
{
    private TMorechar _morechar_;

    public AMorecharCharall()
    {
        // Constructor
    }

    public AMorecharCharall(
        @SuppressWarnings("hiding") TMorechar _morechar_)
    {
        // Constructor
        setMorechar(_morechar_);

    }

    @Override
    public Object clone()
    {
        return new AMorecharCharall(
            cloneNode(this._morechar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMorecharCharall(this);
    }

    public TMorechar getMorechar()
    {
        return this._morechar_;
    }

    public void setMorechar(TMorechar node)
    {
        if(this._morechar_ != null)
        {
            this._morechar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._morechar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._morechar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._morechar_ == child)
        {
            this._morechar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._morechar_ == oldChild)
        {
            setMorechar((TMorechar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
