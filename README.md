# bb4-sgf

This library project is derived from Jigo by Dave Jarvis and published under the
[GNU Public License v2](http://www.gnu.org/licenses/gpl-2.0.html) or later.
The Jigo website is http://whitemagicsoftware.com/software/java/jigo/. Some modifications were made to the Jigo source so it could be
used with a Go applet (and other games) in bb4-game. Only the SGF code used for persistence of game files
has been extracted from the Jigo project. I make no guaranties about the operation of this software. The source
has been placed in com/barrybecker4/ so that the jar can be uploaded to com.barrybecker4 on Sonatype.

### How to Build
Type './gradlew build' at the root. This will build everything, but since its a library project there won't be much to see.
If you want to open the source in Intellij, then first run 'gradle idea'.

When there is a new release, versioned artifacts will be published by Barry Becker to [Sonatype](https://oss.sonatype.org).

### License
All source (unless otherwise specified in individual file) is provided under the [MIT License](http://www.opensource.org/licenses/MIT). In this case most of the code is actually provided under the
 [GNU Public License v2](http://www.gnu.org/licenses/gpl-2.0.html) or later.



