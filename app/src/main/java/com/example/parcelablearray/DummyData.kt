package com.example.parcelablearray

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DummyData(
    private val data: String
) : Parcelable
