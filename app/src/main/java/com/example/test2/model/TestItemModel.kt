package com.example.test2.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TestItemModel(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringTitleResourceId: Int,
    @StringRes val stringCountResourceId: Int,
    @StringRes val stringDescriptionResourceId: Int
    )