package ayds.winchester2.wikipediaexternal.data.wikipedia

import ayds.winchester2.wikipediaexternal.data.wikipedia.entity.Info.ArtistInfo

interface WikipediaTrackService {
    fun getInfo(artistName: String): ArtistInfo?
}