package com.qa.utils;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.File;

public class httpHelper {
    public static String uploadApp(String filePath) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post("https://api-cloud.browserstack.com/app-automate/upload")
                .header("Authorization", "Basic Z293dGhhbXJ1cGF2YXRoYTE6M1VHdGpjR3A4eEY5cHNTbVNmblk=")
                .field("file", new File(filePath))
                .asString();
        return response.getBody();
    }
}
