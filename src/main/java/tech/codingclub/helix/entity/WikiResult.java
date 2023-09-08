package tech.codingclub.helix.entity;

public class WikiResult {

    private String query;
    private String textResult;
    private String imageUrl;
    public WikiResult(String query, String textResult,String imageUrl){
        this.query=query;
        this.textResult=textResult;
        this.imageUrl=imageUrl;
    }

    public String getQuery(){
        return query;
    }
    public String gettextResult(){
        return textResult;
    }
    public String getImageUrl(){
        return imageUrl;
    }


}
