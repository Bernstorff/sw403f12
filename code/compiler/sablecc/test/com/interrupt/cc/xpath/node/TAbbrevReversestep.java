/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TAbbrevReversestep extends Token
{
    public TAbbrevReversestep()
    {
        super.setText("..");
    }

    public TAbbrevReversestep(int line, int pos)
    {
        super.setText("..");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAbbrevReversestep(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAbbrevReversestep(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAbbrevReversestep text.");
    }
}
