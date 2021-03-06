/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import java.util.*;
import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class AAndexpr extends PAndexpr
{
    private PComparisonexpr _comparisonexpr_;
    private final LinkedList<PAndexprPart> _andexprPart_ = new LinkedList<PAndexprPart>();

    public AAndexpr()
    {
        // Constructor
    }

    public AAndexpr(
        @SuppressWarnings("hiding") PComparisonexpr _comparisonexpr_,
        @SuppressWarnings("hiding") List<PAndexprPart> _andexprPart_)
    {
        // Constructor
        setComparisonexpr(_comparisonexpr_);

        setAndexprPart(_andexprPart_);

    }

    @Override
    public Object clone()
    {
        return new AAndexpr(
            cloneNode(this._comparisonexpr_),
            cloneList(this._andexprPart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndexpr(this);
    }

    public PComparisonexpr getComparisonexpr()
    {
        return this._comparisonexpr_;
    }

    public void setComparisonexpr(PComparisonexpr node)
    {
        if(this._comparisonexpr_ != null)
        {
            this._comparisonexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparisonexpr_ = node;
    }

    public LinkedList<PAndexprPart> getAndexprPart()
    {
        return this._andexprPart_;
    }

    public void setAndexprPart(List<PAndexprPart> list)
    {
        this._andexprPart_.clear();
        this._andexprPart_.addAll(list);
        for(PAndexprPart e : list)
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
            + toString(this._comparisonexpr_)
            + toString(this._andexprPart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comparisonexpr_ == child)
        {
            this._comparisonexpr_ = null;
            return;
        }

        if(this._andexprPart_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comparisonexpr_ == oldChild)
        {
            setComparisonexpr((PComparisonexpr) newChild);
            return;
        }

        for(ListIterator<PAndexprPart> i = this._andexprPart_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAndexprPart) newChild);
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
