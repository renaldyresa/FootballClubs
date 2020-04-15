package com.example.submissionandroidpemula

import java.io.Serializable

data class Club (
    var name: String = "",
    var country: String = "",
    var detail: String = "",
    var league: String ="",
    var photo: Int = 0,
    var power: IntArray = intArrayOf(0,0,0),
    var win: IntArray = intArrayOf(0,0,0),
    var coachPhoto: Int = 0,
    var coachName: String = ""
): Serializable