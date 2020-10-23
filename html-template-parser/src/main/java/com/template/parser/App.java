package com.template.parser;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App
{

    public static void main(String[] args ) {
        String HTMLString = "<!DOCTYPE html>" + "<html>" + "<head>" + "<title>JSoup Example</title>" + "</head>" + "<body>" + "<table><tr><td> <h1>HelloWorld</h1></tr>" + "</table>" + "</body>" + "</html>";

        Document htmlFile = (Document) Jsoup.parse(HTMLString);
        System.out.println(htmlFile);
//        try {
//            Document htmlFile = (Document) Jsoup.parse(HTMLString);
//            System.out.println(htmlFile);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
    }
}
