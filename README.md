# Android Library - From an artist's name to is Wikipedia article

This Android library/submodule fetchs an artist data from [Wikipedia's API](https://www.mediawiki.org/wiki/API:Main_page/en)

With a given artist's name, this library obtains:
- A snippet of the artist fetched
- An URL to its Wikipedia full article

## Installation

1. Clone this repo into your `path_to_your_android_project/libs/` folder.
2. Add these lines to your `settings.gradle` file:
``` gradle
include ':wikipediadata'
project(':wikipediadata').projectDir = new File('libs/WikipediaData')
```
3. Add this line to your `app/build.gradle` file, inside the `dependencies` body:
``` gradle
implementation project(":wikipediadata")
```
4. Syncronize gradle files with `Sync now`

## Usage

Using the `getInfo(artistName: String): ArtistInfo?` from [`WikipediaTrackService`](src/main/java/ayds/winchester2/wikipediadata/data/wikipedia/WikipediaTrackService.kt)
``` kotlin
val artistInfo = wikipediaTrackService.getInfo(artistName)
```
- If `wikipediaTrackService.getInfo(artistName)` finds a matching artist, `artistInfo` is and ArtistInfo object with the aformentioned data.
- Otherwise, if there no matching found/Internet connection, `artistInfo` is `null` is returned instead.
