/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TLt extends Token
{
    public TLt()
    {
        super.setText("lt");
    }

    public TLt(int line, int pos)
    {
        super.setText("lt");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLt text.");
    }
}
