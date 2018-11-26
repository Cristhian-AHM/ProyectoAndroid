package com.example.alber.proyecto2.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String picture;
    private String usuario;
    private int hrs;
    private int likes;
    private String title;
    private String body;

    public static List<Post> publicaciones;

    static {
        publicaciones = new ArrayList<>();
        //para la picture("direccion")
        publicaciones.add(new Post("https://apod.nasa.gov/apod/image/1811/Phobos_Viking1_1175.jpg","Cristhian", 2, 10, "Phobos", "This moon is doomed. Mars, the red planet named for the Roman god of war, has two tiny moons, Phobos and Deimos, whose names are derived from the Greek for Fear and Panic. The origin of the Martian moons is unknown, though, with a leading hypothesis holding that they are captured asteroids. The larger moon, at 25-kilometers across, is Phobos, and is indeed seen to be a cratered, asteroid-like object in this false-colored image mosaic taken by the robotic Viking 1 mission in 1978. A recent analysis of the unusual long grooves seen on Phobos indicates that they may result from boulders rolling away from the giant impact that created the crater on the upper left: Stickney Crater. Phobos orbits so close to Mars - about 5,800 kilometers above the surface compared to 400,000 kilometers for our Moon - that gravitational tidal forces are dragging it down. The ultimate result will be for Phobos to break up in orbit and then crash down onto the Martian surface in about 50 million years. Well before that -- tomorrow, in fact, if everything goes according to plan -- NASA's robotic InSight lander will touch down on Mars and begin investigating its internal structure. "));
        publicaciones.add(new Post("https://images-assets.nasa.gov/image/PIA17160/PIA17160~orig.jpg","Alberto", 1, 5, "Saturn from Far and Near", "Saturn winds race furiously around the planet, blowing at high speeds which form distinct belts and zones which encircle the planet pole, as well as its famous hexagon as seen in this image from NASA Cassini spacecraft."));
        publicaciones.add(new Post("https://images-assets.nasa.gov/image/PIA20507/PIA20507~orig.jpg","Kevin", 6, 7, "Angling Saturn", "The Cassini spacecraft takes an angled view toward Saturn, showing the southern reaches of the planet with the rings on a dramatic diagonal. The moon Enceladus appears as a small, bright speck in the lower left of the image."));
        publicaciones.add(new Post("https://images-assets.nasa.gov/image/PIA21390/PIA21390~orig.jpg","Adriana", 3, 1, "Approaching Jupiter", "This enhanced color view of Jupiter's south pole was created by citizen scientist Gabriel Fiset using data from the JunoCam instrument on NASA's Juno spacecraft. Oval storms dot the cloudscape. Approaching the pole, the organized turbulence of Jupiter's belts and zones transitions into clusters of unorganized filamentary structures, streams of air that resemble giant tangled strings. The image was taken on Dec. 11, 2016 at 9:44 a.m. PST (12:44 p.m. EST), from an altitude of about 32,400 miles (52,200 kilometers) above the planet's beautiful cloud tops. "));
        publicaciones.add(new Post("https://images-assets.nasa.gov/image/PIA09113/PIA09113~orig.jpg","Daniel", 8, 15, "Pluto Colorful Composition", "Four images from New Horizons Long Range Reconnaissance Imager LORRI were combined with color data from the spacecraft Ralph instrument to create this enhanced color global view of Pluto."));
        publicaciones.add(new Post("https://images-assets.nasa.gov/image/PIA09926/PIA09926~orig.jpg","Brianda ", 9, 25, "Infrared Coronet Cluster", "This image from NASA Spitzer Space Telescope shows young stars plus diffuse emission from dust. The Corona Australis region containing, at its heart, the Coronet cluster is one of the nearest and most active regions of ongoing star formation."));
    }

    public Post(String picture, String usuario, int hrs, int likes, String title, String body) {
        this.usuario = usuario;
        this.picture= picture;
        this.hrs = hrs;
        this.likes = likes;
        this.title = title;
        this.body = body;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        usuario = usuario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static List<Post> getPublicaciones() {
        return publicaciones;
    }

    public static void setPublicaciones(List<Post> publicaciones) {
        Post.publicaciones = publicaciones;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

