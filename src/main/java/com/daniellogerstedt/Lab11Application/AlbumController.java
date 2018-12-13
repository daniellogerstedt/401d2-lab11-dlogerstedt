package com.daniellogerstedt.Lab11Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;
    @Autowired
    private SongRepository songRepo;

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

    @RequestMapping("/albums/{album}")
    public String oneAlbum (@PathVariable long album, Model m) {
//        List<Song> songs = songRepo.findByAlbumId(album);
        m.addAttribute("album", albumRepo.findById(album).get());
        m.addAttribute("songs", songRepo.findByAlbumId(album));
        return "oneAlbum";
    }

    @RequestMapping(value="/albums/{album}", method=RequestMethod.POST)
    public RedirectView addSong (@PathVariable long album, @RequestParam String songName, @RequestParam int length, @RequestParam int trackNumber) {
//        List<Song> songs = songRepo.findByAlbumId(album);
        Album albumGettingSong = albumRepo.findById(album).get();
        Song newSong = new Song(songName, length, trackNumber);
        newSong.album = albumGettingSong;
        songRepo.save(newSong);
        albumGettingSong.songs.add(newSong);
        albumRepo.save(albumGettingSong);
        return new RedirectView("/albums/" + album);
    }

}
