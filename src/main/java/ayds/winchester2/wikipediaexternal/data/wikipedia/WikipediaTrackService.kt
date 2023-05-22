package ayds.winchester2.wikipediadata.data.wikipedia

import ayds.winchester2.wikipediadata.data.wikipedia.entity.ArtistInfo

interface WikipediaTrackService {
    fun getInfo(artistName: String): ArtistInfo?
}