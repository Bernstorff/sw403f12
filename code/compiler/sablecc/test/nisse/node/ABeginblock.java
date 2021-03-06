/* This file was generated by SableCC (http://www.sablecc.org/). */

package nisse.node;

import nisse.analysis.*;

@SuppressWarnings("nls")
public final class ABeginblock extends PBeginblock
{
    private TBeginkwd _beginkwd_;
    private PBeblock _beblock_;
    private TEol _eol_;

    public ABeginblock()
    {
        // Constructor
    }

    public ABeginblock(
        @SuppressWarnings("hiding") TBeginkwd _beginkwd_,
        @SuppressWarnings("hiding") PBeblock _beblock_,
        @SuppressWarnings("hiding") TEol _eol_)
    {
        // Constructor
        setBeginkwd(_beginkwd_);

        setBeblock(_beblock_);

        setEol(_eol_);

    }

    @Override
    public Object clone()
    {
        return new ABeginblock(
            cloneNode(this._beginkwd_),
            cloneNode(this._beblock_),
            cloneNode(this._eol_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABeginblock(this);
    }

    public TBeginkwd getBeginkwd()
    {
        return this._beginkwd_;
    }

    public void setBeginkwd(TBeginkwd node)
    {
        if(this._beginkwd_ != null)
        {
            this._beginkwd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._beginkwd_ = node;
    }

    public PBeblock getBeblock()
    {
        return this._beblock_;
    }

    public void setBeblock(PBeblock node)
    {
        if(this._beblock_ != null)
        {
            this._beblock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._beblock_ = node;
    }

    public TEol getEol()
    {
        return this._eol_;
    }

    public void setEol(TEol node)
    {
        if(this._eol_ != null)
        {
            this._eol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._beginkwd_)
            + toString(this._beblock_)
            + toString(this._eol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._beginkwd_ == child)
        {
            this._beginkwd_ = null;
            return;
        }

        if(this._beblock_ == child)
        {
            this._beblock_ = null;
            return;
        }

        if(this._eol_ == child)
        {
            this._eol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._beginkwd_ == oldChild)
        {
            setBeginkwd((TBeginkwd) newChild);
            return;
        }

        if(this._beblock_ == oldChild)
        {
            setBeblock((PBeblock) newChild);
            return;
        }

        if(this._eol_ == oldChild)
        {
            setEol((TEol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
