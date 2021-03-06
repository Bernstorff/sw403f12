/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ATypename extends PTypename
{
    private PQname _qname_;

    public ATypename()
    {
        // Constructor
    }

    public ATypename(
        @SuppressWarnings("hiding") PQname _qname_)
    {
        // Constructor
        setQname(_qname_);

    }

    @Override
    public Object clone()
    {
        return new ATypename(
            cloneNode(this._qname_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypename(this);
    }

    public PQname getQname()
    {
        return this._qname_;
    }

    public void setQname(PQname node)
    {
        if(this._qname_ != null)
        {
            this._qname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qname_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qname_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._qname_ == child)
        {
            this._qname_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._qname_ == oldChild)
        {
            setQname((PQname) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
