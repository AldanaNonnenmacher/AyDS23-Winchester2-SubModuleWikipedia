package ayds.winchester2.wikipediaexternal.data.wikipedia

import ayds.winchester2.wikipediaexternal.data.wikipedia.entity.ArtistInfo

interface WikipediaTrackService {
    fun getInfo(artistName: String): ArtistInfo?
}