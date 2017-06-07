import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.xml.sax.InputSource;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class LibraryTest {
  
  @Test
  public void testSomeLibraryMethod() throws IllegalArgumentException, FeedException, IOException {
//    URL urlAddress = new URL("http://www.meteoromania.ro/anm2/avertizari-rss.php");
    
    String charset = "utf-8";
    InputStream is = new URL("http://www.meteoromania.ro/anm2/avertizari-rss.php").openConnection().getInputStream();
    InputSource source = new InputSource(is);

    SyndFeedInput input = new SyndFeedInput();
    SyndFeed feed = input.build(source);
    feed.setEncoding(charset);
    
    System.out.println(feed.toString());
    
//    for (Object entry : feed.getEntries()) {
//      SyndEntryImpl x = (SyndEntryImpl) entry;
//      String text = x.getDescription().getValue();
//      
//      System.out.println(text);
//    }
    
  }
  
}
