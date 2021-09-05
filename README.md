# blase2score
A proof of concept that a blaseball game can be represented as a music score.

## How to run this?
Build as a Maven project, then run the "main" method with no arguments. It will request a game UUID and the number of game updates to be scored. Provide these. The score will be written as MusicXML in score.xml file.

It has only ever been tested with OpenJDK 11.

## What does it use?

[SIBR Chronicler](https://docs.sibr.dev/docs/apis/reference/Chronicler.v1.yaml) to get game info.

[wmn4j](https://github.com/otsob/wmn4j) to write the MusicXML score.
