package com.ahmadarwani.captureimagefromcamera

import android.content.Context
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

private const val FILENAME_FORMAT = "dd-MMM-yyyy"

fun Context.createImageFile(): File {
    // Create an image file name
    val timestamp = SimpleDateFormat(FILENAME_FORMAT, Locale.US).format(System.currentTimeMillis())
    val imageFile = "JPEG_${timestamp}_"
    return File.createTempFile(
        imageFile, /* prefix */
        ".JPG", /* suffix */
        externalCacheDir /* directory */
    )
}