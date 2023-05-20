package ayds.winchester2.wikipediaexternal.data.wikipedia.entity

sealed class Info {

    data class ArtistInfo(
        var description: String,
        var wikipediaURL: String,
        var isLocallyStored: Boolean = false,
    ): Info()

    object EmptyInfo: Info()
}