<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output omit-xml-declaration="yes" indent="yes"/>
  <xsl:strip-space elements="*"/>
  <xsl:template match="/">
    <article class="agreement">

      <img src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" alt=""/>

      <h3>
        <xsl:value-of select="//viewport[3]/text[1]"/>
      </h3>

      <p>
        <strong>
          <xsl:value-of select="//viewport[3]/g[1]//text"/>
        </strong>
      </p>

      <div class="row">
        <div class="col-sm-7">
          <p class="agreement-client">
            <xsl:for-each select="//viewport[3]/g[1]//g/text">
              <xsl:choose>
                <xsl:when test="preceding-sibling::font[1]/@weight = 700">
                  <strong>
                    <xsl:value-of select="."/>
                    <xsl:text> </xsl:text>
                  </strong>
                </xsl:when>
                <xsl:otherwise>
                  <xsl:value-of select="."/>
                  <xsl:text> </xsl:text>
                </xsl:otherwise>
              </xsl:choose>
              <xsl:if test="preceding-sibling::font[1]/@weight = 400">
                <br/>
              </xsl:if>
            </xsl:for-each>
          </p>

        </div>
        <div class="col-sm-5">
          <p class="agreement-bank">
            <small>
              <xsl:for-each select="//viewport[3]/g[2]//text">
                <xsl:value-of select="."/>
                <br/>
              </xsl:for-each>
            </small>
          </p>
        </div>
      </div>

      <xsl:for-each select="//viewport[3]/text[position() > 1]">
        <xsl:choose>
          <xsl:when test="position() = 1">
            <span>
              <xsl:value-of select="."/>
              <xsl:text> </xsl:text>
            </span>
          </xsl:when>
          <xsl:when test="preceding-sibling::font[1]/@weight = 700">
            <strong>
              <xsl:value-of select="."/>
              <xsl:text> </xsl:text>
            </strong>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="."/>
            <xsl:text> </xsl:text>
          </xsl:otherwise>
        </xsl:choose>
        <xsl:if test="following-sibling::*[1]/@weight = 700 and preceding-sibling::text[1] != 'George: '">
          <div class="txt-sep"></div>
        </xsl:if>
      </xsl:for-each>
    </article>
  </xsl:template>

</xsl:stylesheet>