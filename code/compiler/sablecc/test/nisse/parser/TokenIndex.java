/* This file was generated by SableCC (http://www.sablecc.org/). */

package nisse.parser;

import nisse.node.*;
import nisse.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTFormatKwd(@SuppressWarnings("unused") TFormatKwd node)
    {
        this.index = 0;
    }

    @Override
    public void caseTSpace(@SuppressWarnings("unused") TSpace node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSettingkwd(@SuppressWarnings("unused") TSettingkwd node)
    {
        this.index = 2;
    }

    @Override
    public void caseTBeginkwd(@SuppressWarnings("unused") TBeginkwd node)
    {
        this.index = 3;
    }

    @Override
    public void caseTEndkwd(@SuppressWarnings("unused") TEndkwd node)
    {
        this.index = 4;
    }

    @Override
    public void caseTAtsign(@SuppressWarnings("unused") TAtsign node)
    {
        this.index = 5;
    }

    @Override
    public void caseTLcurly(@SuppressWarnings("unused") TLcurly node)
    {
        this.index = 6;
    }

    @Override
    public void caseTRcurly(@SuppressWarnings("unused") TRcurly node)
    {
        this.index = 7;
    }

    @Override
    public void caseTPipe(@SuppressWarnings("unused") TPipe node)
    {
        this.index = 8;
    }

    @Override
    public void caseTFslash(@SuppressWarnings("unused") TFslash node)
    {
        this.index = 9;
    }

    @Override
    public void caseTBslash(@SuppressWarnings("unused") TBslash node)
    {
        this.index = 10;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 11;
    }

    @Override
    public void caseTScolon(@SuppressWarnings("unused") TScolon node)
    {
        this.index = 12;
    }

    @Override
    public void caseTBlist(@SuppressWarnings("unused") TBlist node)
    {
        this.index = 13;
    }

    @Override
    public void caseTNlist(@SuppressWarnings("unused") TNlist node)
    {
        this.index = 14;
    }

    @Override
    public void caseTPercent(@SuppressWarnings("unused") TPercent node)
    {
        this.index = 15;
    }

    @Override
    public void caseTEol(@SuppressWarnings("unused") TEol node)
    {
        this.index = 16;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 17;
    }

    @Override
    public void caseTDigit(@SuppressWarnings("unused") TDigit node)
    {
        this.index = 18;
    }

    @Override
    public void caseTMorechar(@SuppressWarnings("unused") TMorechar node)
    {
        this.index = 19;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 20;
    }
}
