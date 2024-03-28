# Song Playlist App

## Contents:
- `Album.java`: This class represents an album containing songs. It provides methods to add songs to the album, find a song by title, and add songs to a playlist.
- `Main.java`: This class contains the main method and orchestrates the music playing functionality. It allows users to interact with the application by providing a menu-driven interface to play songs, navigate playlists, and perform other operations.
- `Song.java`: This class represents a song with attributes such as title and duration.

## How to Use:
1. Clone the repository to your local machine using `git clone`.
2. Open the project in your preferred Java IDE.
3. Compile the code and run the `Main` class.
4. Follow the on-screen instructions to interact with the music player application.

## Features:
- Add songs to albums and create playlists.
- Play songs from playlists.
- Navigate through playlists by playing next, previous, or current songs.
- Replay the current song.
- Delete songs from playlists.

## Contributing:
Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## Note:
Please ensure you have Java Development Kit (JDK) installed on your system to run this application.

## Java and Object-Oriented Programming (OOPs) Concepts

- **Encapsulation**: Encapsulation is demonstrated through the use of private instance variables (`name`, `artist`, `songs`) in the `Album` class. These variables are encapsulated within the class, accessible only through getter and setter methods.

- **Inheritance**: While not explicitly demonstrated in this code, inheritance allows classes to inherit attributes and methods from other classes. Inheritance can be utilized to create a hierarchy of classes, with more specialized classes inheriting from more general ones.

- **Polymorphism**: Polymorphism allows objects to be treated as instances of their parent class or any of their subclasses. In this project, polymorphism is implicitly used when adding songs to playlists. The `addToPlayList` method in the `Album` class is overloaded, enabling it to accept either a track number or a song title as parameters.

- **Abstraction**: Abstraction is the process of hiding the implementation details and showing only the essential features of an object. In this project, the `Album` and `Song` classes abstract the details of albums and songs, respectively, providing essential methods for managing them without exposing their internal workings.

- **Composition**: Composition involves creating complex objects by combining simpler ones. The `Main` class demonstrates composition by creating instances of `Album` and `Song` classes and adding songs to albums.

- **Method Overloading**: Method overloading allows multiple methods with the same name but different parameters in the same class. The `addToPlayList` method in the `Album` class is overloaded to accept either a track number or a song title as parameters.

- **Collections**: Collections such as `ArrayList` and `LinkedList` are utilized to store and manage lists of songs and playlists efficiently.

- **Iterators**: Iterators are used to traverse through collections. In the `play` method of the `Main` class, a `ListIterator` is used to iterate through the playlist and control song playback.

  

![Screenshot 2024-03-28 050048](https://github.com/applesleaf/SongPlaylistApp/assets/126444266/8fe77811-afa9-43b4-ad71-d077eeca97e0)
