package com.daniellogerstedt.Lab11Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @RequestMapping("/albums")
    public String indexAlbums (Model m) {
        m.addAttribute("albums", albumRepo.findAll());
        return "indexAlbums";
    }

    @RequestMapping(value="/albums", method= RequestMethod.POST)
    public RedirectView addAlbum (@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageURL) {
        Album addedAlbum = new Album(title, artist, songCount, length, imageURL);
        albumRepo.save(addedAlbum);
        return new RedirectView("/albums");
    }

}
