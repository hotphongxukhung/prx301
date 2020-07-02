<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <cpus>
            <xsl:for-each select="//table/tr[not(contains(@class,'header'))]">
                <cpu>
                    <model>
                        <xsl:value-of select="normalize-space(./td[2]/a/text()|./td[2][not(a)])"></xsl:value-of>
                    </model>
                    <codename>
                         <xsl:value-of select="normalize-space(./td[3]/text())"></xsl:value-of>
                    </codename>
                    <mhzTurbo>
                        <xsl:value-of select="normalize-space(./td[4]/text())"></xsl:value-of>
                    </mhzTurbo>
                    <coresThread>
                        <xsl:value-of select="normalize-space(./td[5]/text())"></xsl:value-of>
                    </coresThread>
                    <architecture>
                        <xsl:value-of select="normalize-space(./td[6]/text())"></xsl:value-of>
                    </architecture>
                    <bit64>
                        <xsl:value-of select="normalize-space(./td[7]/img/@alt)"></xsl:value-of>
                    </bit64>
                    <bit32Single>
                        <xsl:value-of select="normalize-space(./td[9]/div/span[4]/span/text())"></xsl:value-of>
                    </bit32Single>
                    <bit32Multi>
                        <xsl:value-of select="normalize-space(./td[10]/div/span[4]/span/text())"></xsl:value-of>
                    </bit32Multi>
                    <bit64Single4>
                        <xsl:value-of select="normalize-space(./td[11]/div/span[4]/span/text())"></xsl:value-of>
                    </bit64Single4>
                    <bit64Multi4>
                        <xsl:value-of select="normalize-space(./td[12]/div/span[4]/span/text())"></xsl:value-of>
                    </bit64Multi4>
                    <bit64Single5>
                        <xsl:value-of select="normalize-space(./td[13]/div/span[4]/span/text())"></xsl:value-of>
                    </bit64Single5>
                    <bit64Multi5>
                        <xsl:value-of select="normalize-space(./td[14]/div/span[4]/span/text())"></xsl:value-of>
                    </bit64Multi5>
                </cpu>
            </xsl:for-each>
        </cpus>
    </xsl:template>

</xsl:stylesheet>
