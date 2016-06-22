package com.aeq.Encoding;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
 
public class URLEncodingEx {
 
    public static void main(String args[]){
     
        try {
            System.out.println(URLEncoder.encode("String x`with spaces", "UTF-8"));
            System.out.println(URLEncoder.encode("special chars: &%*", "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}