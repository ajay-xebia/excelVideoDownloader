package com.download;

import java.io.File;
import java.net.URL;

import com.github.axet.vget.VGet;

public class DirectDownloader {

    public static void main(String[] args) { 
    	String url = "https://www.youtube.com/watch?v=RpzgNOi8r2w&t=0s&list=PLPbVevbMS3Mpa3sNk6fWpFdIWevJ2yVT2&index=2";//args[0];
        String path = "C:\\Users\\ajayyadav\\Downloads";//args[1];
        downloadVideo(url, path);
    }
    
    public static void downloadVideo(String url, String path){
    	try {
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}