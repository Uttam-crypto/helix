package tech.codingclub.helix.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub.helix.global.HttpURLConnectionExample;

import java.util.Date;

public class WikipediaDownloader{
    private  String keyword;
    public WikipediaDownloader(String keyword){
        this.keyword=keyword;
    }
    public WikiResult getResult() {
        if (this.keyword == null || this.keyword.length() == 0) {
            return null;
        }

        this.keyword = this.keyword.trim().replaceAll("[ ]+", "_");
        String wikiUrl = getWikipediaUrlForQuery(this.keyword);
        String response = "";
        String imageUrl = null;

        try {
            String wikipediaResponseHtml = HttpURLConnectionExample.sendGet(wikiUrl);
            Document document = Jsoup.parse(wikipediaResponseHtml, "https://en.wikipedia.org/wiki");

            Elements childElements = document.body().select(".mw-parser-output > *");
            int state = 0;
            for (Element childElement : childElements) {
                if (childElement.tagName().equals("table")) state = 1;
                else if (state == 1) {
                    if (childElement.tagName().equals("p")) {
                        state = 2;
                        response = childElement.text();
                        break;
                    }
                }
            }
            try {
                imageUrl = document.body().select(".infobox img").get(0).attr("src");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }
        WikiResult wikiResult=new WikiResult(this.keyword,response,imageUrl);
        return wikiResult;

    }
    private String getWikipediaUrlForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;

    }
}
