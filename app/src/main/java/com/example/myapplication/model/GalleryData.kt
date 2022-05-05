package com.example.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GalleryData(@DrawableRes val imageResourceId: Int, @StringRes val nameResourceId: Int, @StringRes val descResourceId: Int)
