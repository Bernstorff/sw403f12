/* This file was generated by SableCC (http://www.sablecc.org/). */

package nisse.node;

import nisse.analysis.*;

@SuppressWarnings("nls")
public final class ADigitShortidentv1 extends PShortidentv1
{
    private TDigit _digit_;

    public ADigitShortidentv1()
    {
        // Constructor
    }

    public ADigitShortidentv1(
        @SuppressWarnings("hiding") TDigit _digit_)
    {
        // Constructor
        setDigit(_digit_);

    }

    @Override
    public Object clone()
    {
        return new ADigitShortidentv1(
            cloneNode(this._digit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADigitShortidentv1(this);
    }

    public TDigit getDigit()
    {
        return this._digit_;
    }

    public void setDigit(TDigit node)
    {
        if(this._digit_ != null)
        {
            this._digit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._digit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._digit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._digit_ == child)
        {
            this._digit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._digit_ == oldChild)
        {
            setDigit((TDigit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
