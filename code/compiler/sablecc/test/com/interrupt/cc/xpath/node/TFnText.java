/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TFnText extends Token
{
    public TFnText()
    {
        super.setText("text");
    }

    public TFnText(int line, int pos)
    {
        super.setText("text");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFnText(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFnText(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFnText text.");
    }
}