/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class APrefixedQname extends PQname
{
    private PPrefixedname _prefixedname_;

    public APrefixedQname()
    {
        // Constructor
    }

    public APrefixedQname(
        @SuppressWarnings("hiding") PPrefixedname _prefixedname_)
    {
        // Constructor
        setPrefixedname(_prefixedname_);

    }

    @Override
    public Object clone()
    {
        return new APrefixedQname(
            cloneNode(this._prefixedname_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrefixedQname(this);
    }

    public PPrefixedname getPrefixedname()
    {
        return this._prefixedname_;
    }

    public void setPrefixedname(PPrefixedname node)
    {
        if(this._prefixedname_ != null)
        {
            this._prefixedname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prefixedname_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prefixedname_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prefixedname_ == child)
        {
            this._prefixedname_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prefixedname_ == oldChild)
        {
            setPrefixedname((PPrefixedname) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}