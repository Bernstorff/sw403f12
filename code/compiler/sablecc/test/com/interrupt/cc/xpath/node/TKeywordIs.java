/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TKeywordIs extends Token
{
    public TKeywordIs()
    {
        super.setText("is");
    }

    public TKeywordIs(int line, int pos)
    {
        super.setText("is");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKeywordIs(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKeywordIs(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKeywordIs text.");
    }
}
