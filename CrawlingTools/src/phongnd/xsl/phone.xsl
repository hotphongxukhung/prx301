<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <phone>
            <name>
                <xsl:value-of select="normalize-space(//h1[@class='title-head'])"/>
            </name>
            <screen>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[2],':'))"/>
            </screen>
            <resolution>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[3],':'))"/>
            </resolution>
            <screenSize>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[4],':'))"/>
            </screenSize>
            <cameraFront>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[7],':'))"/>
            </cameraFront>
            <cameraBack>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[12],':'))"/>
            </cameraBack>
            <operatingSystem>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[16],':'))"/>
            </operatingSystem>
            <cpu>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='fs-tsright']/ul/li[6],':'))"/>
            </cpu>
            <gpu>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[19],':'))"/>
            </gpu>
            <ram>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[21],':'))"/>
            </ram>
            <rom>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[22],':'))"/>
            </rom>
            <battery>
                <xsl:value-of select="normalize-space(substring-after(//div[@class='modal-body']/ul/li[40],':'))"/>
            </battery>
        </phone>
    </xsl:template>
</xsl:stylesheet>
