package com.example.remoteapisaugust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-info")
    public Object getMovieInfo(){

        String url = "https://api.themoviedb.org/3/movie/603692?api_key=99dbb307a83ec8dff8143bcc68bdb756";
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }

    @GetMapping("/get-customised-info")
    public MovieResponse getMovieCustomisedInfo(){

        String url = "https://api.themoviedb.org/3/movie/603692?api_key=99dbb307a83ec8dff8143bcc68bdb756";
        MovieResponse response = restTemplate.getForObject(url,MovieResponse.class);
        return response;
    }

    // calling local APIs
    @GetMapping("/get-student")
    public Object getStudent(@RequestParam("id") int regNo){

        String url = "http://localhost:8090/student/get?q="+regNo;
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
}
