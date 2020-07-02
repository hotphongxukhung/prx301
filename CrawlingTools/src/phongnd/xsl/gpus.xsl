<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <gpus>
            <xsl:for-each select="//table/tr[not(contains(@class,'header'))]">
                <gpu>
                    <model>
                        <xsl:value-of select="normalize-space(./td[2]/a/text()|./td[2][not(a)])"></xsl:value-of>
                    </model>
                     <architecture>
                        <xsl:value-of select="normalize-space(./td[3]/text())"></xsl:value-of>
                    </architecture>
                    <shaders>
                        <xsl:value-of select="normalize-space(./td[4]/text())"></xsl:value-of>
                    </shaders>
                    <coreSpeed>
                        <xsl:value-of select="normalize-space(./td[5]/text())"></xsl:value-of>
                    </coreSpeed>
                    <openGL>
                        <xsl:value-of select="normalize-space(./td[6]/text())"></xsl:value-of>
                    </openGL>
                    <iceStrom>
                        <xsl:value-of select="normalize-space(./td[7]/div/span[4]/span/text())"></xsl:value-of>
                    </iceStrom>
                    <gfxBench>
                        <xsl:value-of select="normalize-space(./td[8]/div/span[4]/span/text())"></xsl:value-of>
                    </gfxBench>
                    <offscreenOGL>
                        <xsl:value-of select="normalize-space(./td[9]/div/span[4]/span/text())"></xsl:value-of>
                    </offscreenOGL>
                    <esOffscreen>
                        <xsl:value-of select="normalize-space(./td[10]/div/span[4]/span/text())"></xsl:value-of>
                    </esOffscreen>
                </gpu>
            </xsl:for-each>
        </gpus>
    </xsl:template>

</xsl:stylesheet>
