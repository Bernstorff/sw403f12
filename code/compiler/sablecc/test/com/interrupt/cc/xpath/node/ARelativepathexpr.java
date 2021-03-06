/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import java.util.*;
import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class ARelativepathexpr extends PRelativepathexpr
{
    private PStepexpr _stepexpr_;
    private final LinkedList<PRelativepathexprPart> _relativepathexprPart_ = new LinkedList<PRelativepathexprPart>();

    public ARelativepathexpr()
    {
        // Constructor
    }

    public ARelativepathexpr(
        @SuppressWarnings("hiding") PStepexpr _stepexpr_,
        @SuppressWarnings("hiding") List<PRelativepathexprPart> _relativepathexprPart_)
    {
        // Constructor
        setStepexpr(_stepexpr_);

        setRelativepathexprPart(_relativepathexprPart_);

    }

    @Override
    public Object clone()
    {
        return new ARelativepathexpr(
            cloneNode(this._stepexpr_),
            cloneList(this._relativepathexprPart_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelativepathexpr(this);
    }

    public PStepexpr getStepexpr()
    {
        return this._stepexpr_;
    }

    public void setStepexpr(PStepexpr node)
    {
        if(this._stepexpr_ != null)
        {
            this._stepexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stepexpr_ = node;
    }

    public LinkedList<PRelativepathexprPart> getRelativepathexprPart()
    {
        return this._relativepathexprPart_;
    }

    public void setRelativepathexprPart(List<PRelativepathexprPart> list)
    {
        this._relativepathexprPart_.clear();
        this._relativepathexprPart_.addAll(list);
        for(PRelativepathexprPart e : list)
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
            + toString(this._stepexpr_)
            + toString(this._relativepathexprPart_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stepexpr_ == child)
        {
            this._stepexpr_ = null;
            return;
        }

        if(this._relativepathexprPart_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stepexpr_ == oldChild)
        {
            setStepexpr((PStepexpr) newChild);
            return;
        }

        for(ListIterator<PRelativepathexprPart> i = this._relativepathexprPart_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PRelativepathexprPart) newChild);
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
