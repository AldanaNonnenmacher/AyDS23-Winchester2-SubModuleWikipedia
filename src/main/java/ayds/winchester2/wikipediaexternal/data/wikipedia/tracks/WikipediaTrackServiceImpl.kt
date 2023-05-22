package ayds.winchester2.wikipediaexternal.data.wikipedia.tracks

import ayds.winchester2.wikipediaexternal.data.wikipedia.WikipediaTrackService
import ayds.winchester2.wikipediaexternal.data.wikipedia.entity.ArtistInfo
import retrofit2.Response

class WikipediaTrackServiceImpl(
    private val wikipediaTrackAPI: WikipediaTrackAPI,
    private val wikipediaToInfoResolver: WikipediaToInfoResolver,
) : WikipediaTrackService {

    override fun getInfo(artistName: String): ArtistInfo? {
        val callResponse = getInfoFromService(artistName)
        return wikipediaToInfoResolver.getInfoFromExternalData(callResponse.body())
    }

    private fun getInfoFromService(artistName: String): Response<String> {
        return wikipediaTrackAPI.getArtistInfo(artistName)
            .execute()
    }
}