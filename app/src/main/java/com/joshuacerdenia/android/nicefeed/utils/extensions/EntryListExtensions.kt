package com.joshuacerdenia.android.nicefeed.utils.extensions

import com.joshuacerdenia.android.nicefeed.data.model.Entry
import com.joshuacerdenia.android.nicefeed.data.model.EntryLight

fun List<Entry>.sortedByDate() = this.sortedByDescending { it.date }

@JvmName("sortedByDateEntryLight")
fun List<EntryLight>.sortedByDate() = this.sortedByDescending { it.date }

fun List<EntryLight>.sortedUnreadOnTop() = this.sortedByDate().sortedBy { it.isRead }