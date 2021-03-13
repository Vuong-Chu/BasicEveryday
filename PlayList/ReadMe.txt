Create a program that implements a playlist of songs.

To start you off, implement the following classes:

1.  Album

    -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.

    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

    -  And three methods, they are:

        -  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.

        -  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.

        -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.

        -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

2.  Song

    -   It has two fields, a String called title and a double called duration.

    -  A constructor that accepts a String (title of the song) and a double (duration of the song). It initialises title and duration.

    -  And two methods, they are:

        -  getTitle(), getter for title.

        -  toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"
