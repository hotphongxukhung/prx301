/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongnd.statemachine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kazen
 */
public class TextUtils {

    private static final String[] IGNORE_TAGS = new String[]{"script", "noscript", "head", "style", "iframe"};

    public static String refineHTML(String html) {
        html = removeNeedLessTags(html);
        html = XmlSyntaxChecker.check(html);
        html = getMainContent(html);
        return html;
    }

    private static String getMainContent(String src) {
        String result = src;
        String expression = "<body.*?</body>";
        Pattern pattern = Pattern.compile(expression);

        Matcher matcher = pattern.matcher(result);
        if (matcher.find()) {
            result = matcher.group(0);
        }
        return result;
    }

    private static String removeNeedLessTags(String src) {
        String result = src;

        // remove all <script> tags
        String expression = "<script.*?</script>";
        result = result.replaceAll(expression, "");

        // remove all comments
        expression = "<!--.*?-->";
        result = result.replaceAll(expression, "");

        // remove all whitespace 
        expression = "&nbsp;?";
        result = result.replaceAll(expression, "");

        expression = "<head.*?</head>";
        result = result.replaceAll(expression, "");
        
         expression = "<noscript.*?</noscript>";
        result = result.replaceAll(expression, "");

        return result;
    }
}
