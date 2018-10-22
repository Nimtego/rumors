package com.nimtego.rumors.domain

import com.nimtego.rumors.domain.entity.Album
import com.nimtego.rumors.domain.entity.Artist
import com.nimtego.rumors.domain.entity.Song
import io.reactivex.Observable

interface Repository {
    fun albums(search : String): Observable<List<Album>>
    fun songs(search : String): Observable<List<Song>>
    fun artists(search : String): Observable<List<Artist>>
}