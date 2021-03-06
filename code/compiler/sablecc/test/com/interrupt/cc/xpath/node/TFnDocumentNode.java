/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.interrupt.cc.xpath.node;

import com.interrupt.cc.xpath.analysis.*;

@SuppressWarnings("nls")
public final class TFnDocumentNode extends Token
{
    public TFnDocumentNode()
    {
        super.setText("document-node");
    }

    public TFnDocumentNode(int line, int pos)
    {
        super.setText("document-node");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFnDocumentNode(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFnDocumentNode(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFnDocumentNode text.");
    }
}
