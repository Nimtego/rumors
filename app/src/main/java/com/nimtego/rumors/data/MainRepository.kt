package com.nimtego.rumors.data

import com.nimtego.rumors.domain.Repository
import com.nimtego.rumors.domain.entity.Album
import com.nimtego.rumors.domain.entity.Artist
import com.nimtego.rumors.domain.entity.Song
import io.reactivex.Observable

class MainRepository : Repository{

    private lateinit var apiHelper : ApiHelper
    private lateinit var preferenceHelper: PreferenceHelper

    override fun albums(search: String): Observable<List<Album>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun songs(search: String): Observable<List<Song>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun artists(search: String): Observable<List<Artist>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}