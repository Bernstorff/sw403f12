/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import java.util.*;
import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicativeexpr extends PMultiplicativeexpr
{
    private PUnionexpr _unionexpr_;
    private final LinkedList<PMultiplicativeexprPart> _multiplicativeexprPart_ = new LinkedList<PMultiplicativeexprPart>();

    public AMultiplicativeexpr()
    {
        // Constructor
    }

    public AMultiplicativeexpr(
        @SuppressWarnings("hiding") PUnionexpr _unionexpr_,
        @SuppressWarnings("hiding") List<PMultiplicativeexprPart> _multiplicativeexprPart_)
    {
        // Constructor
        setUnionexpr(_unionexpr_);

        setMultiplicativeexprPart(_multiplicativeexprPart_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicativeexpr(
            cloneNode(this._unionexpr_),
            cloneList(this._multiplicativeexprPart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicativeexpr(this);
    }

    public PUnionexpr getUnionexpr()
    {
        return this._unionexpr_;
    }

    public void setUnionexpr(PUnionexpr node)
    {
        if(this._unionexpr_ != null)
        {
            this._unionexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unionexpr_ = node;
    }

    public LinkedList<PMultiplicativeexprPart> getMultiplicativeexprPart()
    {
        return this._multiplicativeexprPart_;
    }

    public void setMultiplicativeexprPart(List<PMultiplicativeexprPart> list)
    {
        this._multiplicativeexprPart_.clear();
        this._multiplicativeexprPart_.addAll(list);
        for(PMultiplicativeexprPart e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unionexpr_)
            + toString(this._multiplicativeexprPart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unionexpr_ == child)
        {
            this._unionexpr_ = null;
            return;
        }

        if(this._multiplicativeexprPart_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unionexpr_ == oldChild)
        {
            setUnionexpr((PUnionexpr) newChild);
            return;
        }

        for(ListIterator<PMultiplicativeexprPart> i = this._multiplicativeexprPart_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMultiplicativeexprPart) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
