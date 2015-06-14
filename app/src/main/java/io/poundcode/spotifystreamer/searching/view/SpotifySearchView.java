package io.poundcode.spotifystreamer.searching.view;

/**
 * Created by Atlas on 6/11/2015.
 */
public interface SpotifySearchView<T> {
    void search(String query);
    void onClickedSearch();
    void onEmptyResults();
    void onError(String message);
    void populate(T results);
}