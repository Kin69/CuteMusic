package com.sosauce.cutemusic.customs

fun Long.formatBinarySize(): String {
    val kiloByteAsByte = 1.0 * 1024.0
    val megaByteAsByte = 1.0 * 1024.0 * 1024.0
    val gigaByteAsByte = 1.0 * 1024.0 * 1024.0 * 1024.0
    return when {
        this < kiloByteAsByte -> "${this.toDouble()} B"
        this >= kiloByteAsByte && this < megaByteAsByte -> "${String.format("%.2f", (this / kiloByteAsByte))} KB"
        this >= megaByteAsByte && this < gigaByteAsByte -> "${String.format("%.2f", (this / megaByteAsByte))} MB"
        else -> "Bigger than 1024 TB"
    }
}