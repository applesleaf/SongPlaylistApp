package com.SongPlaylistApp;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args){

        Album album = new Album("Butterfly","Mariah Carey");

        album.addSong("Honey", 5.02);
        album.addSong("Butterfly", 4.36);
        album.addSong("My All", 3.53);
        album.addSong("The Roof", 5.15);
        album.addSong("Fourth of July", 4.23);
        album.addSong("Breakdown (featuring Krayzie Bone and Wish Bone)", 4.45);
        album.addSong("Babydoll", 5.07);
        album.addSong("Close My Eyes", 4.22);
        album.addSong("Whenever You Call", 4.22);
        album.addSong("Fly Away (Butterfly Reprise)", 3.49);
        album.addSong("The Beautiful Ones (Prince cover) (featuring Dru Hill)", 7.00);
        album.addSong("Outside", 4.46);
        albums.add(album);

        album = new Album("After Hours","The Weekend");

        album.addSong("Alone Again", 4.10);
        album.addSong("Too Late", 3.59);
        album.addSong("Hardest to Love", 3.31);
        album.addSong("Scared to Live", 3.11);
        album.addSong("Snowchild", 4.07);
        album.addSong("Escape from LA", 5.55);
        album.addSong("Heartless", 3.18);
        album.addSong("Faith", 4.43);
        album.addSong("Blinding Lights", 3.20);
        album.addSong("In Your Eyes", 3.57);
        album.addSong("Save Your Tears", 3.35);
        album.addSong("Repeat After Me (Interlude)", 3.15);
        album.addSong("After Hours", 6.01);
        album.addSong("Until I Bleed Out", 3.10);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("My All", playList_1);
        albums.get(0).addToPlayList("The Roof", playList_1);
        albums.get(0).addToPlayList("Outside", playList_1);
        albums.get(1).addToPlayList("Heartless", playList_1);
        albums.get(1).addToPlayList("Blinding Lights", playList_1);
        albums.get(1).addToPlayList("Save Your Tears", playList_1);

        play(playList_1);

    }

    private static void play(LinkedList<Song> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size()==0){
            System.out.println("This playlist is empty");
        }
        else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist is complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next().toString());
                    }
                    else{
                        System.out.println("There is no song to play next.");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now Platying "+ listIterator.previous().toString());
                    }
                    else {
                        System.out.println("This is the first song of the playlist");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playiing " + listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("This is the start of the playlist");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("This is the end of the playlist");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                   printMenu();
                   break;

                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+listIterator.next().toString());
                        }
                        else{
                            if(listIterator.hasPrevious())
                            System.out.printf("Now Playing " +listIterator.previous().toString());
                        }
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println(" Your options\n press" );
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("------------------------------");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------");
    }

}
