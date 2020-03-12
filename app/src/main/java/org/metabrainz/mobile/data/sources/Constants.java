package org.metabrainz.mobile.data.sources;

public class Constants {
    public static final String LOOKUP_ARTIST_PARAMS =
            "url-rels+releases+ratings+tags";
    public static final String LOOKUP_RELEASE_PARAMS =
            "recordings+url-rels+artist-credits";
    public static final String LOOKUP_LABEL_PARAMS =
            "releases+url-rels+ratings+tags";
    public static final String LOOKUP_RECORDING_PARAMS =
            "releases+media+artists+artist-credits+ratings+tags";
    public static final String LOOKUP_RELEASE_GROUP_PARAMS =
            "releases+artist-credits+url-rels+release-rels+media+ratings+tags";
    public static final String TAGGER_RELEASE_PARAMS = "release-groups+media+recordings+" +
            "artist-credits+artists+aliases+labels+isrcs+collections+artist-rels+release-rels+" +
            "url-rels+recording-rels+work-rels";
    public static final String ACOUST_ID_RESPONSE_PARAMS = "recordings releasegroups releases " +
            "tracks compress sources";
    public static final String USER_DATA_PARAMS =
            "+user-tags+user-ratings";

    public static final String LIMIT = "100";
    public static final String OFFSET = "0";
}
