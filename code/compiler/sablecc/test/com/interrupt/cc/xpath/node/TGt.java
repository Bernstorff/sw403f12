/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TGt extends Token
{
    public TGt()
    {
        super.setText("gt");
    }

    public TGt(int line, int pos)
    {
        super.setText("gt");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGt text.");
    }
}
