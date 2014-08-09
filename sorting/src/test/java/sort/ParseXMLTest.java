package sort;

import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import util.MRDPUtils;


public class ParseXMLTest {

    String record1 = "<row Id=\"1\" PostTypeId=\"1\" AcceptedAnswerId=\"2\" CreationDate=\"2012-05-01T18:20:27.167\" Score=\"22\" ViewCount=\"680\" Body=\"&lt;p&gt;Once I encountered an opponent who used a very early a6 in his Sicilian Opening. &lt;/p&gt;&#xA;&#xA;&lt;pre&gt;&lt;code&gt;[FEN &quot;&quot;]&#xA;&#xA;1. e4 c5 2. Nf3 a6&#xA;&lt;/code&gt;&lt;/pre&gt;&#xA;&#xA;&lt;p&gt;What could have been his objective with this move and how should I have have countered it?&lt;/p&gt;&#xA;\" OwnerUserId=\"8\" LastEditorUserId=\"1656\" LastEditDate=\"2013-09-04T22:08:58.223\" LastActivityDate=\"2013-12-01T12:49:07.780\" Title=\"What are the consequences of an early a6 in the Sicilian?\" Tags=\"&lt;sicilian-defense&gt;&lt;opening&gt;\" AnswerCount=\"3\" CommentCount=\"2\" FavoriteCount=\"2\" />";
    String record2 = " <row Id=\"2\" PostTypeId=\"2\" ParentId=\"1\" CreationDate=\"2012-05-01T18:51:50.697\" Score=\"23\" Body=\"&lt;p&gt;This is called the O'Kelly variation of the Sicilian.&lt;/p&gt;&#xA;&#xA;&lt;p&gt;If white plays normally (i.e. &lt;code&gt;3.d4 cxd4 4.Nxd4 Nf6 5.Nc3&lt;/code&gt;), then black can eventually kick the d4 knight with &lt;code&gt;...e5&lt;/code&gt; when the knight doesn't have any great squares.  In this case, &lt;code&gt;2... a6&lt;/code&gt; keeps the knight from moving to the natural b5 square (as in the Sveshnikov Sicilian).  This will allow black to quickly play &lt;code&gt;...d5&lt;/code&gt; with equality.&lt;/p&gt;&#xA;&#xA;&lt;p&gt;White's best plan is to play either &lt;code&gt;c3&lt;/code&gt; or &lt;code&gt;c4&lt;/code&gt; trying to prove that black's move &lt;code&gt;2... a6&lt;/code&gt; is not a good developing move.  When white plays &lt;code&gt;c3&lt;/code&gt;, the natural plan is to follow up with &lt;code&gt;d4&lt;/code&gt;, and then if black plays &lt;code&gt;...cxd4&lt;/code&gt;, white will respond with &lt;code&gt;cxd4&lt;/code&gt;, gaining a classical pawn center.  When white plays &lt;code&gt;c4&lt;/code&gt; instead, white's plan is to set up a &lt;a href=&quot;http://en.wikipedia.org/wiki/Mar%C3%B3czy_Bind&quot;&gt;Maroczy bind&lt;/a&gt;.&lt;/p&gt;&#xA;&#xA;&lt;p&gt;An unambitious plan for white would be to play into a closed Sicilian - in the closed Sicilian, black frequently plays a6-b5 in order to get counterplay on the queenside.  Furthermore, in the closed Sicilian, tempi matter a lot less because the position will not change radically from one move to the next.&lt;/p&gt;&#xA;\" OwnerUserId=\"12\" LastEditorUserId=\"86\" LastEditDate=\"2012-06-09T20:31:16.707\" LastActivityDate=\"2012-06-09T20:31:16.707\" CommentCount=\"2\" />";


  @Test
    public void testParse() {
     String sortKey;
     Map<String, String> myMap;
     myMap = MRDPUtils.transformXmlToMap(record1);
     sortKey = myMap.get("LastActivityDate");

     System.out.println("Sort key for record1 is: " + sortKey);

     myMap = MRDPUtils.transformXmlToMap(record2);
     sortKey = myMap.get("LastActivityDate");

     System.out.println("Sort key for record2 is: " + sortKey);

  }

}
