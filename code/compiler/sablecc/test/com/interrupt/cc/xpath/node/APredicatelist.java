/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import java.util.*;
import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class APredicatelist extends PPredicatelist
{
    private final LinkedList<PPredicate> _predicate_ = new LinkedList<PPredicate>();

    public APredicatelist()
    {
        // Constructor
    }

    public APredicatelist(
        @SuppressWarnings("hiding") List<PPredicate> _predicate_)
    {
        // Constructor
        setPredicate(_predicate_);

    }

    @Override
    public Object clone()
    {
        return new APredicatelist(
            cloneList(this._predicate_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPredicatelist(this);
    }

    public LinkedList<PPredicate> getPredicate()
    {
        return this._predicate_;
    }

    public void setPredicate(List<PPredicate> list)
    {
        this._predicate_.clear();
        this._predicate_.addAll(list);
        for(PPredicate e : list)
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
            + toString(this._predicate_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._predicate_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PPredicate> i = this._predicate_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PPredicate) newChild);
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