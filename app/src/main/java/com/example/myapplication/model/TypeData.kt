package com.example.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TypeData(@DrawableRes val imageResourceId: Int,
                    @StringRes val descResourceId: Int,
                    @StringRes val detailResourceId: Int)
