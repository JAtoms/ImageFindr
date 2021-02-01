package com.dtechatoms.imagefindr.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Joshua Nwokoye on 2/1/2021.
 */

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val urls: UnsplashPhotoUrls,
    val user: UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnsplashPhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String
    ) : Parcelable

    @Parcelize
    data class UnsplashUser(
        val name: String,
        val username: String
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com$username?utm_source=ImageFindr&utm_medium=referral"
    }
}
