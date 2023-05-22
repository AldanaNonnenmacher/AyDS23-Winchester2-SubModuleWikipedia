package ayds.winchester2.wikipediadata.injector


import ayds.winchester2.wikipediadata.data.wikipedia.WikipediaTrackService
import ayds.winchester2.wikipediadata.data.wikipedia.tracks.JsonToInfoResolver
import ayds.winchester2.wikipediadata.data.wikipedia.tracks.WikipediaToInfoResolver
import ayds.winchester2.wikipediadata.data.wikipedia.tracks.WikipediaTrackAPI
import ayds.winchester2.wikipediadata.data.wikipedia.tracks.WikipediaTrackServiceImpl
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val WIKIPEDIA_URL = "https://en.wikipedia.org/w/"

object WikipediaInjector {
    private val wikipediaAPIRetrofit = getRetrofit()
    private val wikipediaTrackAPI = getWikipediaAPI(wikipediaAPIRetrofit)
    private val wikipediaToInfoResolver: WikipediaToInfoResolver = JsonToInfoResolver()

    val wikipediaTrackService: WikipediaTrackService =
        WikipediaTrackServiceImpl(
            wikipediaTrackAPI,
            wikipediaToInfoResolver
        )

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(WIKIPEDIA_URL)
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()

    private fun getWikipediaAPI(retrofit: Retrofit) = retrofit.create(WikipediaTrackAPI::class.java)
}